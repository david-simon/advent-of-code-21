package xyz.davidsimon.aoc21

class Day1 : Solution {
    override val inputFileName = "day1.txt"

    override fun printSolution() {
        val values = readInputLines().map { it.toInt() }

        part1(values)
        part2(values)
    }

    private fun part1(values: List<Int>) {
        var lastValue = values.first()
        var increases = 0

        for(value in values) {
            if(value > lastValue) ++increases
            lastValue = value
        }
        println(increases)
    }

    private fun part2(values: List<Int>) {
        val sums = values.windowed(3).map { it.sum() }
        part1(sums)
    }
}