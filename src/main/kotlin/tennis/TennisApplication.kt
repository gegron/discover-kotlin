package tennis

import tennis.SCORE.*

enum class SCORE(private val display: String, val next: SCORE) {
    WON("Win", WON),
    ADVANTAGE("Advantage", WON),
    DEUCE("Deuce", ADVANTAGE),
    FORTY("40", WON),
    THIRTY("30", FORTY),
    FIFTEEN("15", THIRTY),
    ZERO("0", FIFTEEN);

    override fun toString(): String {
        return display
    }
}

class Game() {
    var player1Score = ZERO;
    var player2Score = ZERO;

    fun score(): String {

        return when {
            player1Score == WON -> "Player 1 won !"
            player2Score == WON -> "Player 2 won !"
            player1Score == ADVANTAGE -> "Advantage Player 1"
            player2Score == ADVANTAGE -> "Advantage Player 2"
            player1Score == DEUCE && player2Score == DEUCE -> "Deuce"
            else -> "$player1Score - $player2Score"
        }
    }

    fun player1Scored() {
        player1Score = player1Score.next

        deuceIfEquality()
    }

    fun player2Scored() {
        player2Score = player2Score.next

        deuceIfEquality()
    }

    private fun deuceIfEquality() {
        if ((player1Score == FORTY && player2Score == FORTY) || (player1Score == ADVANTAGE && player2Score == ADVANTAGE)) {
            player1Score = DEUCE
            player2Score = DEUCE
        }
    }

}

fun main() {
    println("Launch Tennis score")
}