package com.example.mtgvariant

import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class ArchenemyActivity : AppCompatActivity() {
    private var cards = arrayOf("adisplayofmydarkpower", "areckoningapproaches", "allingoodtime", "allshallsmolderinmywake", "approachmymoltenrealm", "becauseihavewilledit", "beholdmygrandeur", "beholdthepowerofdestruction", "bowtomycommand", "chooseyourchampion", "chooseyourdemise", "dancepatheticmarionette", "delightinthehunt", "embracemydiabolicalvision", "everydreamanightmare", "everyhopeshallvanish", "everylastvestigeshallrot", "evilcomestofruition", "feedthemachine", "foreachofyouagift", "ibaskinyoursilentawe", "icallontheancientmagics", "idelightinyourconvulsions", "iknowalliseeall", "ignitethecloneforge", "intotheearthenmaw", "introductionsareinorder", "knowevil", "knownaughtbutfire", "lookskywardanddespair", "makeyourselfuseful", "maycivilizationcollapse", "mortalfleshisweak", "mycrushingmasterstroke", "myforcesareinnumerable", "mygeniusknowsnobounds", "mylaughterechoes", "myundeadhordeawakens", "mywishisyourcommand", "naturedemandsanoffering", "natureshieldsitsown", "noonewillhearyourcries", "nothingcanstopmenow", "onlybloodendsyournightmares", "paytributetome", "powerwithoutequal", "realmsbefittingmymajesty", "rootsofallevil", "rottedoneslaysiege", "surrenderyourthoughts", "thedeadshallserve", "thefateoftheflammable", "theironguardianstirs", "themightywillfall", "thepiecesarecomingtogether", "theverysoilshallshake", "thereisnorefuge", "thisworldbelongstome", "toothclawandtail", "whatsyoursisnowmine", "whenwillyoulearn", "whichofyouburnsbrightest", "yourfateisthricesealed", "yourpunymindscannotfathom", "yourwillisnotyourown")
    private var cardSeen = IntArray(cards.size) { 0 }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archenemy)

        val mainButton = findViewById<Button>(R.id.button_Card)
        mainButton.setOnLongClickListener {
            ongoingClicked(mainButton.background)
            true
        }
    }

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    fun ongoingClicked(background: Drawable) {
        var linearLayout = findViewById<LinearLayout>(R.id.linearlayout_Ongoing)

        val button = Button(this)
        button.background = background
        button.setOnLongClickListener {
            linearLayout.removeView(button)
            true
        }
        linearLayout.addView(button)
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

            val nextCardId: Int = this@ArchenemyActivity.resources.getIdentifier(
                cards[nextCardIndex],
                "drawable",
                this@ArchenemyActivity.packageName
            )

            cardButton.text = ""
            cardButton.setBackgroundResource(nextCardId)
        }
        else {
            cardButton.setBackgroundResource(R.drawable.archenemyback)
            cardSeen = IntArray(cards.size) { 0 }
        }
    }

    fun rulesClicked(view: View)  {
        val intent = Intent(this, RulesActivity::class.java).apply {
            putExtra(CONTEXT_RULES, "Archenemy")
        }
        startActivity(intent)
    }
}
