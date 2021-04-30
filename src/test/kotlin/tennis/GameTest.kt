package tennis

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class GameTest {

    @Test
    fun launchGame() {
        // When a game is created
        val game = Game()

        // Then score is 0 - 0
        assertEquals("0 - 0", game.score())

        // When Player 1 scored
        game.player1Scored();
        assertEquals("15 - 0", game.score())

        // When Player 2 scored
        game.player2Scored()
        assertEquals("15 - 15", game.score())

        game.player1Scored() // 30
        game.player1Scored() // 40
        game.player2Scored() // 30
        game.player2Scored() // 40 -> DEUCE

        // Then
        assertEquals("Deuce", game.score())

        game.player1Scored() // Advantage Player 1
        assertEquals("Advantage Player 1", game.score())

        game.player2Scored() // Deuce
        assertEquals("Deuce", game.score())

        game.player2Scored() // Advantage Player 2
        assertEquals("Advantage Player 2", game.score())

        game.player2Scored() // WIN Player 2

        // Then
        assertEquals("Player 2 won !", game.score())
    }
}