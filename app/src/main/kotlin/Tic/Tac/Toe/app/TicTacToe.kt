package Tic.Tac.Toe.app

class TicTacToe {
    fun move(row: Int, column: Int): Array<Array<String>>{
        return arrayOf(arrayOf(" ", " ", " "),
                       arrayOf(" ", " ", " "),
                       arrayOf(" ", "X", " "))

    }
}