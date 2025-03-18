import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test
import kotlin.test.assertContentEquals

class MinDistanceForDeliveryTest {
    @Test
    fun example1() {
        assertEquals(16, MinDistanceForDelivery().solution(4, 5, intArrayOf(1,0,3,1,2), intArrayOf(0,3,0,4,0)))
    }

    @Test
    fun example2() {
        assertEquals(30, MinDistanceForDelivery().solution(2, 7, intArrayOf(1,0,2,0,1,0,2), intArrayOf(0,2,0,1,0,2,0)))
    }
}