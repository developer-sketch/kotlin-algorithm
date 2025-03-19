import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class EmoticonDiscountTest {
    @Test
    fun example1() {
        assertContentEquals(longArrayOf(1, 5400), EmoticonDiscountEvent().solution(2, 2, arrayOf( intArrayOf(40, 10000), intArrayOf(25, 10000)), intArrayOf(7000, 9000)))
    }
}