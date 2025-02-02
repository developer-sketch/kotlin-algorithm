class DFSTargetNumberWayCounter {
    private var cnt: Int = 0

    fun solution(targetNumber: Int, array: IntArray): Int {
        calculate(0, targetNumber, array, 0)
        return cnt
    }

    fun solutionForDebug(targetNumber: Int, array: IntArray): Int {
        calculateForDebug(0, targetNumber, array, 0, "")
        return cnt
    }

    private fun calculate(result: Int, targetNumber: Int, array: IntArray, index:Int) {
        if (array.size == index) {
            if (result == targetNumber) cnt++
            return
        }

        calculate(result + array[index], targetNumber, array, index + 1)
        calculate(result - array[index], targetNumber, array, index + 1)
    }

    private fun calculateForDebug(result: Int, targetNumber: Int, array: IntArray, index: Int, str: String) {
        println("index : $index -----------")
        println(str)
        println(result)
        if (array.size == index) {
            if (result == targetNumber) cnt++
            return
        }

        calculateForDebug(result + array[index], targetNumber, array, index + 1, "$result + ${array[index]}")
        calculateForDebug(result - array[index], targetNumber, array, index + 1, "$result - ${array[index]}")
    }
}