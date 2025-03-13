import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ReportResultMailCounterTest {
    @Test
    fun example1() {
        assertContentEquals(intArrayOf(2,1,1,0), ReportResultMailCounter().solution(
            arrayOf("muzi", "frodo", "apeach", "neo"),
            arrayOf("muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"),
            2))
    }

    @Test
    fun example2() {
        assertContentEquals(intArrayOf(0,0), ReportResultMailCounter().solution(
            arrayOf("con", "ryan"),
            arrayOf("ryan con", "ryan con", "ryan con", "ryan con"),
            3
        ))
    }
}