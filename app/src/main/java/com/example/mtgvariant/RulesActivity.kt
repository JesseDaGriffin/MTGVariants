package com.example.mtgvariant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView

class RulesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        val context = intent.getStringExtra(CONTEXT_RULES)

        if(context == "Planechase") {
            var button = findViewById<Button>(R.id.button_Planechase)
            button.performClick()
        }
        if(context == "Archenemy") {
            var button = findViewById<Button>(R.id.button_Archenemy)
            button.performClick()
        }
    }

    fun pcRuleCLick(view: View) {
        val textfield = findViewById<TextView>(R.id.textView_Rules)
        val scrollview = findViewById<ScrollView>(R.id.scrollview)

        scrollview.fullScroll(ScrollView.FOCUS_UP)

        textfield.text =
                "901. Planechase\n\n" +
                "901.1. In the Planechase variant, plane cards and phenomenon cards add additional abilities and randomness to the game. The Planechase variant uses all the normal rules for a Magic game, with the following additions.\n\n" +
                "901.2. A Planechase game may be a two-player game or a multiplayer game. The default multiplayer setup is the Free-for-All variant with the attack multiple players option and without the limited range of influence option. See rule 806, “Free-for-All Variant.”\n\n" +
                "901.3. In addition to the normal game materials, each player needs a planar deck of at least ten plane and/or phenomenon cards and the game needs one planar die. No more than two cards in a planar deck can be phenomenon cards. Each card in a planar deck must have a different English name. (See rule 309, “Planes,” and rule 310, “Phenomena.”)\n\n" +
                "901.3a A planar die is a six-sided die. One face has the Planeswalker symbol {PW}. One face has the chaos symbol {CHAOS}. The other faces are blank.\n\n" +
                "901.4. At the start of the game, each player shuffles their planar deck so that the cards are in a random order. Each deck is placed face down next to its owner’s library. All plane and phenomenon cards remain in the command zone throughout the game, both while they’re part of a planar deck and while they’re face up.\n\n" +
                "901.5. Once all players have kept their opening hands and used the abilities of cards that allow them to take an action with those cards from their opening hands, the starting player moves the top card of their planar deck off that planar deck and turns it face up. If it’s a phenomenon card, the player puts that card on the bottom of their planar deck and repeats this process until a plane card is turned face up. (See rule 103.6.) No abilities of any card turned face up this way trigger during this process. The face-up plane card becomes the starting plane.\n\n" +
                "901.6. The owner of a plane or phenomenon card is the player who started the game with it in their planar deck. The controller of a face-up plane or phenomenon card is the player designated as the planar controller. Normally, the planar controller is whoever the active player is. However, if the current planar controller would leave the game, instead the next player in turn order that wouldn’t leave the game becomes the planar controller, then the old planar controller leaves the game. The new planar controller retains that designation until they leave the game or a different player becomes the active player, whichever comes first.\n\n" +
                "901.7. Any abilities of a face-up plane card or phenomenon card in the command zone function from that zone. The card’s static abilities affect the game, its triggered abilities may trigger, and its activated abilities may be activated.\n\n" +
                "901.7a A face-up plane card or phenomenon card that’s turned face down becomes a new object.\n\n" +
                "901.8. Planechase games have an inherent triggered ability known as the “planeswalking ability.” The full text of this ability is “Whenever you roll {PW}, planeswalk.” (See rule 701.23, “Planeswalk.”) This ability has no source and is controlled by the player whose planar die roll caused it to trigger. This is an exception to rule 113.8.\n\n" +
                "901.9. Any time the active player has priority and the stack is empty, but only during a main phase of their turn, that player may roll the planar die. Taking this action costs a player an amount of mana equal to the number of times they have previously taken this action on that turn. This is a special action and doesn’t use the stack. Note that this number won’t be equal to the number of times the player has rolled the planar die that turn if an effect has caused the player to roll the planar die that turn. (See rule 116.2g.)\n\n" +
                "901.9a If the die roll is a blank face, nothing happens. The active player gets priority.\n\n" +
                "901.9b If the die roll is the chaos symbol {CHAOS}, any ability of a face-up plane that starts “When you roll {CHAOS}” triggers and is put on the stack. The active player gets priority.\n\n" +
                "901.9c If the die roll is the Planeswalker symbol {PW}, the “planeswalking ability” triggers and is put on the stack. The active player gets priority. (See rule 901.8.)\n\n" +
                "901.10. When a player leaves the game, all objects owned by that player except abilities from phenomena leave the game. (See rule 800.4a.) If that includes a face-up plane card or phenomenon card, the planar controller turns the top card of their planar deck face up. This is not a state-based action. It happens as soon as the player leaves the game.\n\n" +
                "901.10a If a plane leaves the game while a “planeswalking ability” is on the stack, that ability ceases to exist.\n\n" +
                "901.10b Abilities from phenomena owned by a player who left the game remain on the stack controlled by the new planar controller.\n\n" +
                "901.11. After the game has started, if a player moves the top card of their planar deck off that planar deck and turns it face up, that player has “planeswalked.” Continuous effects with durations that last until a player planeswalks end. Abilities that trigger when a player planeswalks trigger. See rule 701.23.\n\n" +
                "901.11a A player may planeswalk as the result of the “planeswalking ability” (see rule 901.8), because the owner of a face-up plane card or phenomenon card leaves the game (see rule 901.10), or because a phenomenon’s triggered ability leaves the stack (see rule 704.5x). Abilities may also instruct a player to planeswalk.\n\n" +
                "901.11b The plane card that’s turned face up is the plane the player planeswalks to. The plane card or phenomenon card that’s turned face down, or that leaves the game, is the plane or phenomenon the player planeswalks away from.\n\n" +
                "901.11c If a player planeswalks when there is more than one face-up plane card, that player planeswalks away from all such planes.\n\n" +
                "901.12. A Two-Headed Giant Planechase game uses all the rules for the Two-Headed Giant multiplayer variant and all the rules for the Planechase casual variant, with the following additions.\n\n" +
                "901.12a Each player has their own planar deck.\n\n" +
                "901.12b The planar controller is normally the primary player of the active team. However, if the current planar controller’s team would leave the game, instead the primary player of the next team in turn order that wouldn’t leave the game becomes the planar controller, then the old planar controller’s team leaves the game. The new planar controller retains that designation until they leave the game or a different team becomes the active team, whichever comes first.\n\n" +
                "901.12c Even though the face-up plane or phenomenon is controlled by just one player, any ability of that plane or phenomenon that refers to “you” applies to both members of the planar controller’s team.\n\n" +
                "901.12d Since each member of the active team is an active player, each of them may roll the planar die. Each player’s cost to roll the planar die is based on the number of times that particular player has already rolled the planar die that turn.\n\n" +
                "901.13. In multiplayer formats other than Grand Melee, plane cards and phenomenon cards are exempt from the limited range of influence option. Their abilities, and the effects of those abilities, affect all applicable objects and players in the game. (See rule 801, “Limited Range of Influence Option.”)\n\n" +
                "901.14. In Grand Melee Planechase games, multiple plane cards or phenomenon cards may be face up at the same time.\n\n" +
                "901.14a Before the first turn of the game of the game, each player who will start the game with a turn marker sets a starting plane (see rule 901.5). Each of them is a planar controller.\n\n" +
                "901.14b If a player would leave the game and that player leaving the game would reduce the number of turn markers in the game, that player first ceases to be a planar controller (but no other player becomes a planar controller), then that player leaves the game. Each face-up plane card or phenomenon card that player controlled is put on the bottom of its owner’s planar deck. No player is considered to have planeswalked.\n\n" +
                "901.15. Single Planar Deck Option\n\n" +
                "901.15a As an alternative option, a Planechase game may be played with just a single communal planar deck. In that case, the number of cards in the planar deck must be at least forty or at least ten times the number of players in the game, whichever is smaller. The planar deck can’t contain more phenomenon cards than twice the number of players in the game. Each card in the planar deck must have a different English name.\n\n" +
                "901.15b In a Planechase game using the single planar deck option, the planar controller is considered to be the owner of all cards in the planar deck.\n\n" +
                "901.15c If any rule or ability refers to a player’s planar deck, the communal planar deck is used."
    }

    fun archenemyRuleCLick(view: View) {
        val textfield = findViewById<TextView>(R.id.textView_Rules)
        val scrollview = findViewById<ScrollView>(R.id.scrollview)

        scrollview.fullScroll(ScrollView.FOCUS_UP)

        textfield.text =
                "904. Archenemy\n\n" +
                "904.1. In the Archenemy variant, a team of players faces off against a single opponent strengthened with powerful scheme cards. The Archenemy variant uses all the normal rules for a Magic game, with the following additions.\n\n" +
                "904.2. The default setup for an Archenemy game is the Team vs. Team multiplayer variant (see rule 808) involving exactly two teams. The attack multiple players option (see rule 802) and the shared team turns option (see rule 805) are used; no other multiplayer options are used.\n\n" +
                "904.2a One of the teams consists of exactly one player, who is designated the archenemy.\n\n" +
                "904.2b The other team consists of any number of players.\n\n" +
                "904.3. In addition to the normal game materials, the archenemy needs a scheme deck of at least twenty scheme cards. A scheme deck may contain no more than two of any card with a particular English name. (See rule 312, “Schemes.”)\n\n" +
                "904.4. At the start of the game, the archenemy shuffles their scheme deck so that the cards are in a random order. The scheme deck is placed face down next to the archenemy’s library. All scheme cards remain in the command zone throughout the game, both while they’re part of a scheme deck and while they’re face up.\n\n" +
                "904.5. The archenemy’s starting life total is 40. Each other player’s starting life total is 20.\n\n" +
                "904.6. Rather than a randomly determined player, the archenemy takes the first turn of the game.\n\n" +
                "904.7. The owner of a scheme card is the player who started the game with it in the command zone. The controller of a face-up scheme card is its owner.\n\n" +
                "904.8. Any abilities of a face-up scheme card in the command zone function from that zone. The card’s static abilities affect the game, its triggered abilities may trigger, and its activated abilities may be activated.\n\n" +
                "904.9. Immediately after the archenemy’s precombat main phase begins during each of their turns, that player moves the top card of their scheme deck off that scheme deck and turns it face up. This is called “setting that scheme in motion.” (See rule 701.24.) This turn-based action doesn’t use the stack. Abilities of that scheme card that trigger “When you set this scheme in motion” trigger.\n\n" +
                "904.10. If a non-ongoing scheme card is face up in the command zone, and no triggered abilities of any scheme are on the stack or waiting to be put on the stack, that scheme card is turned face down and put on the bottom of its owner’s scheme deck the next time a player would receive priority. (This is a state-based action. See rule 704.)\n\n" +
                "904.11. Once an ongoing scheme card is set in motion, it remains face up in the command zone until an ability causes it to be abandoned (see rule 701.25).\n\n" +
                "904.12. Supervillain Rumble Option\n\n" +
                "904.12a As an alternative option, players may play a Free-for-All game in which each player has their own scheme deck. The attack multiple players option (see rule 802) is used; no other multiplayer options are used.\n\n" +
                "904.12b Each player in this game is an archenemy.\n\n" +
                "904.12c As in a normal Free-for-All game, the starting player is randomly determined. All other rules that apply to the archenemy in an Archenemy game apply to each player in a Supervillain Rumble game."
    }
}
