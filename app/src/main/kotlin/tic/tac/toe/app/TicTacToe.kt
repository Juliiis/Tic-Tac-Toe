package tic.tac.toe.app

class TicTacToe {
    fun move(row: Int, column: Int): Array<Array<String>>{
        return arrayOf(arrayOf(" ", " ", " "),
                       arrayOf(" ", "O", " "),
                       arrayOf(" ", "X", " "))

    }
}