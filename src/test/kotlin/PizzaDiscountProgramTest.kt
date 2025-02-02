import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import PizzaDiscountProgram.Pizza
import PizzaDiscountProgram.OrderItem

class PizzaDiscountProgramTest {
    @Test
    fun example1() {
        assertEquals(27, PizzaDiscountProgram().solution(
            arrayOf(
                Pizza("Pepperoni", 60,50,70),
                Pizza("Combination", 40,30,50),
            ),
            arrayOf(
                OrderItem("Pepperoni", "Large", 3),
                OrderItem("Pepperoni", "Small", 3),
                OrderItem("Combination", "Medium", 2),
            )
        ))
    }

    @Test
    fun example2() {
        assertEquals(24, PizzaDiscountProgram().solution(
            arrayOf(
                Pizza("Pepperoni", 60,50,70),
                Pizza("Combination", 40,30,50),
            ),
            arrayOf(
                OrderItem("Pepperoni", "Large", 4),
                OrderItem("Combination", "Medium", 1),
            )
        ))
    }

    @Test
    fun example3() {
        assertEquals(160, PizzaDiscountProgram().solution(
            arrayOf(
                Pizza("Pepperoni", 60,50,70),
                Pizza("Combination", 40,30,50),
            ),
            arrayOf(
                OrderItem("Pepperoni", "Large", 5),
                OrderItem("Combination", "Medium", 2),
            )
        ))
    }

    @Test
    fun example4() {
        assertEquals(110, PizzaDiscountProgram().solution(
            arrayOf(
                Pizza("Pepperoni", 60,50,20),
                Pizza("Combination", 40,50,50),
            ),
            arrayOf(
                OrderItem("Pepperoni", "Large", 3),
                OrderItem("Combination", "Medium", 4),
            )
        ))
    }
}