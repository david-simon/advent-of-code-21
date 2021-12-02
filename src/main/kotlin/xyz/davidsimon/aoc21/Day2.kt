package xyz.davidsimon.aoc21

class Day2 : Solution {
    override val inputFileName = "day2.txt"

    override fun printSolution() {
        val values = readInputLines()
            .map { it.split(" ").let { line -> line[0] to line[1].toInt() } }

        part1(values)
        part2(values)
    }

    private fun part1(values: List<Pair<String, Int>>) {
        var forward = 0
        var depth = 0

        for(value in values) {
            when(value.first) {
                "forward" -> forward += value.second
                "down" -> depth += value.second
                "up" -> depth -= value.second
            }
        }

        println(forward * depth)
    }

    private fun part2(values: List<Pair<String, Int>>) {
        var aim = 0
        var forward = 0
        var depth = 0

        for(value in values) {
            when(value.first) {
                "forward" -> {
                    forward += value.second
                    depth += value.second * aim
                }
                "down" -> aim += value.second
                "up" -> aim -= value.second
            }
        }

        println(forward * depth)
    }
}