package day1

import java.io.File

/*
* How many measurements are larger than the previous measurement?
*/
fun main() {
    val testMeasures = listOf(
        199,
        200,
        208,
        210,
        200,
        207,
        240,
        269,
        260,
        263,
    )
    assert(countIncreases(testMeasures) == 5)

    val measures = File("src/main/resources/day1/input.txt")
        .readLines()
        .map(String::toInt)
    println(countIncreases(measures))
}

private fun countIncreases(measures: List<Int>): Int {
    var previous = measures.first()
    val numberOfIncreases = measures.count { current ->
        (previous < current).also {
            previous = current
        }
    }
    return numberOfIncreases
}
