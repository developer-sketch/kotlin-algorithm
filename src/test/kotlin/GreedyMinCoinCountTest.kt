import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class GreedyMinCoinCountTest {
    @Test
    fun example1() {
        val n = 10
        val k = 4200
        val coins = intArrayOf(1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000)

        assertEquals(6, GreedyMinCoinCounter().count(n, k, coins))
    }

    @Test
    fun example2() {
        val n = 10
        val k = 4790
        val coins = intArrayOf(1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000)

        assertEquals(12, GreedyMinCoinCounter().count(n, k, coins))
    }
}