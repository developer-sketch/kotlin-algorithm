class GreedyMinCoinCounter {
    fun count(n:Int, k:Int, coins:IntArray) :Int {
        var remain = k
        var count = 0
        var coin : Int
        for (i in n - 1 downTo 1) {
            coin = coins[i]
            if (coin <= remain) {
                count += (remain / coin)
                remain %= coin
            }
        }

        return count
    }
}