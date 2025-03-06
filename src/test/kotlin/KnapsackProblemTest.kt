import org.junit.jupiter.api.Test
import KnapsackProblem.Good
import org.junit.jupiter.api.Assertions.assertEquals

class KnapsackProblemTest {
    @Test
    fun example1() {
       val goods = arrayOf(Good(100,1), Good(10,10000), Good(20,100), Good(70,200))
       assertEquals(10300, KnapsackProblem().solution(4, 100, goods))
    }
}