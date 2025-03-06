class KnapsackProblem() {
    class Good (var weight: Int, var price: Int)

    fun solution(n :Int, w :Int, goods: Array<Good>) :Int {
        val dp = IntArray(w + 1)
        for (good in goods) {
            for (weight in w downTo good.weight) {
                dp[weight] = maxOf(dp[weight], dp[weight - good.weight] + good.price)
            }
        }
        return dp[w]
    }
}