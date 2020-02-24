package com.example.mtgvariant

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

const val CONTEXT_RULES = "com.example.MTGVariant.CONTEXT"

class PlanechaseActivity : AppCompatActivity() {

    private var cards = arrayOf("academyattolariawest", "agyrem", "akoum", "aretopolis", "astralarena", "bant", "bloodhillbastion", "celestinereef", "chaoticaetherchaoticaether", "cliffsidemarket", "edgeofmalacol", "elorenwilds", "feedinggrounds", "fieldsofsummer", "furnacelayer", "gavony", "glenelendra", "glimmervoidbasin", "goldmeadow", "grandossuary", "grixis", "groveofthedreampods", "hedronfieldsofagadeem", "horizonboughs", "immersturm", "interplanartunnel", "isleofvesuva", "izzetsteammaze", "jund", "kessig", "kharashafoothills", "kilnspiredistrict", "krosa", "lairoftheashenidol", "lethelake", "llanowar", "minamo", "mirroreddepths", "morphictide", "mountkeralia", "murasa", "mutualepiphany", "naarisle", "naya", "nephalia", "nornsdominion", "onakkecatacomb", "orochicolony", "orzhova", "otaria", "panopticon", "planewidedisaster", "poolsofbecoming", "prahv", "quicksilversea", "ravensrun", "realityshaping", "sanctumofserra", "seaofsand", "selesnyaloftgardens", "shiv", "skybreen", "sokenzan", "spatialmerging", "stairstoinfinity", "stensia", "strongholdfurnace", "takenuma", "talongates", "tazeem", "tembercity", "theaetherfluestheaetherflues", "thedarkbarony", "theeonfog", "thefourthsphere", "thegreatforest", "thehippodrome", "themaelstrom", "thezephyrmaze", "timedistortion", "trailofthemagerings", "trugajungle", "turriisland", "undercityreaches", "velisvel", "windriddlepalaces")
    private var cardSeen = IntArray(cards.size) { 0 }
    private val dieSides = arrayOf(R.drawable.die_blanksymbol, R.drawable.die_blanksymbol, R.drawable.die_chaossymbol, R.drawable.die_blanksymbol, R.drawable.die_blanksymbol, R.drawable.die_planesymbol)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planechase)
    }

    fun nextCardClick(view: View) {
        val cardButton = findViewById<Button>(R.id.button_Card)
        var nextCardIndex :Int

        if(cardSeen.contains(0)) {
            while (true) {
                nextCardIndex = Random.nextInt(cards.size)

                if(cardSeen[nextCardIndex] == 0) {
                    cardSeen[nextCardIndex] = 1
                    break
                }
            }

            val nextCardId: Int = this@PlanechaseActivity.resources.getIdentifier(
                cards[nextCardIndex],
                "drawable",
                this@PlanechaseActivity.packageName
            )

            cardButton.text = ""
            cardButton.setBackgroundResource(nextCardId)
        }
        else {
            cardButton.setBackgroundResource(R.drawable.planechaseback)
            cardSeen = IntArray(cards.size) { 0 }
        }
    }

    fun dieRollClick(view: View) {
        val dieButton = findViewById<Button>(R.id.button_Die)
        var colorRoll = 0

        object : CountDownTimer(750, 250) {
            override fun onTick(millisUntilFinished: Long) { // do something after 1s
                dieButton.text = "Rolling"
                if(colorRoll == 0) {
                    colorRoll += 1
                    dieButton.setBackgroundResource(R.color.colorBlack)
                }
                else {
                    dieButton.setBackgroundResource(R.color.colorGray)
                }
            }

            override fun onFinish() { // do something end times 5s
                dieButton.text = ""
                dieButton.setBackgroundResource(dieSides[Random.nextInt(6)])
            }
        }.start()
    }

    fun rulesClicked(view: View)  {
        val intent = Intent(this, RulesActivity::class.java).apply {
            putExtra(CONTEXT_RULES, "Planechase")
        }
        startActivity(intent)
    }
}

