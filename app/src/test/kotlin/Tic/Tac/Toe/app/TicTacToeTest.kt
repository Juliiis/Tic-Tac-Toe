package Tic.Tac.Toe.app

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TicTacToeTest {
    @Test fun fillThePlace(){
        var game = TicTacToe()
        var result: Array<Array<String>> = game.move(2, 1)
        assertEquals(arrayOf(arrayOf(" ", " ", " "),
                             arrayOf(" ", " ", " "),
                             arrayOf(" ", "X", " ")), result)
    }
}