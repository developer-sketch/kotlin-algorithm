import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BFSNetworkCounterTest {
    @Test
    fun example1() {
        assertEquals(2, BFSNetworkCounter().count(3, arrayOf(intArrayOf(1,1,0), intArrayOf(1,1,0), intArrayOf(0,0,1))))
    }

    @Test
    fun example2() {
        assertEquals(1, BFSNetworkCounter().count(3, arrayOf(intArrayOf(1,1,0), intArrayOf(1,1,1), intArrayOf(0,1,1))))
    }
}