package tic.tac.toe.app

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class TicTacToeTest {
    @Test fun firstPlayerX(){
        var game = TicTacToe()
        var result: Array<Array<String>> = game.move(2, 1)
        assertArrayEquals(arrayOf(arrayOf(" ", " ", " "),
                                  arrayOf(" ", " ", " "),
                                  arrayOf(" ", "X", " ")), result)
    }
    @Test fun secondPlayerO(){
        var game = TicTacToe()
        var resultX: Array<Array<String>> = game.move(2, 1)
        var resultO: Array<Array<String>> = game.move(1, 1)

        assertArrayEquals(arrayOf(arrayOf(" ", " ", " "),
                                  arrayOf(" ", "O", " "),
                                  arrayOf(" ", "X", " ")), resultO)
    }
}