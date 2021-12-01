package xyz.davidsimon.aoc21

interface Solution {
    val inputFileName: String

    fun printSolution()

    fun readInputLines(): List<String> {
        val file = object {}.javaClass.getResourceAsStream("/$inputFileName")

        return file.bufferedReader().readLines()
    }
}