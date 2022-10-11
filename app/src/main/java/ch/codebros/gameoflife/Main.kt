package ch.codebros.gameoflife

fun main(args: Array<String>) {
/*
    val rows = try {
        args[0].toInt()
    } catch (e: NumberFormatException) {
        12
    }

    val columns = try {
        args[1].toInt()
    } catch (e: NumberFormatException) {
        12
    }

*/

    val rows = 15
    val columns = 30

    val gameboard: Gameboard = Gameboard(rows, columns)
    val printer = Printer(gameboard)


    // test cases
//    gameboard.getBoard()[4][6].alive = 1
//    gameboard.getBoard()[5][7].alive = 1
//    gameboard.getBoard()[6][5].alive = 1
//    gameboard.getBoard()[6][6].alive = 1
//    gameboard.getBoard()[6][7].alive = 1

    for (iter in 1..50) {
        println("")
        println("")
        println("")
        println("iteration $iter:")
        printer.printGameboard()
        gameboard.determineFate()
        Thread.sleep(350)
    }
}