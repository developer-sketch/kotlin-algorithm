class KnapsackProblem() {
    class Good (var weight: Int, var price: Int) :Comparable<Good> {
        override fun compareTo(other: Good) :Int {
            if (this.price > other.price) return 1
            else if (this.price < other.price) return 0
            else
                return if (this.weight <= other.weight) 1
                        else 0
        }
    }
    fun solution(n :Int, w :Int, goods: Array<Good>) :Int {
        goods.sort()
        var total = 0
        var weights = 0
        for (good in goods) {
            total += good.price
            weights += good.weight
            if (weights >= w) break
        }
        return total
    }
}