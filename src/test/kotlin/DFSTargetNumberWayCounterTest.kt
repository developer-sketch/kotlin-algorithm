import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DFSTargetNumberWayCounterTest {
    @Test
    fun example1() {
        assertEquals(1, DFSTargetNumberWayCounter().solutionForDebug(2, intArrayOf(1,1)))
        assertEquals(1, DFSTargetNumberWayCounter().solution(2, intArrayOf(1,1)))
    }

    @Test
    fun example2() {
        assertEquals(5, DFSTargetNumberWayCounter().solution(3, intArrayOf(1,1,1,1,1)))
    }
}