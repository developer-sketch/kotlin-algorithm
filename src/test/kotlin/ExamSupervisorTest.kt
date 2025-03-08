import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ExamSupervisorTest {
    @Test
    fun example1() {
        assertEquals(1, ExamSupervisor().solution(1,arrayOf (1),1,1))
    }

    @Test
    fun example2() {
        assertEquals(7, ExamSupervisor().solution(3, arrayOf(3,4,5), 2, 2))
    }

    @Test
    fun example3() {
        assertEquals(714290, ExamSupervisor().solution(5, arrayOf(1000000, 1000000, 1000000, 1000000, 1000000), 5, 7))
    }

    @Test
    fun example4() {
        assertEquals(10, ExamSupervisor().solution(5, arrayOf(10, 9, 10, 9, 10), 7, 20))
    }

    @Test
    fun example5() {
        assertEquals(13, ExamSupervisor().solution(5, arrayOf(10, 9, 10, 9, 10), 7, 2))
    }
}