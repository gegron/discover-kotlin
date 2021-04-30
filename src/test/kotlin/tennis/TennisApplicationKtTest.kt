package tennis

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TennisApplicationTest {

    @Test
    fun launchGame() {
        val game = Game()

        assertEquals("0 - 0", game.score())

        game.player1Scored();
        assertEquals("15 - 0", game.score())
    }
}