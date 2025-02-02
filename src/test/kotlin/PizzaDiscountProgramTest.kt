import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import PizzaDiscountProgram.Pizza
import PizzaDiscountProgram.OrderItem

class PizzaDiscountProgramTest {
    @Test
    fun example1() {
        assertEquals(27, PizzaDiscountProgram().solution(
            arrayOf(
                Pizza("Pepperoni", 6,5,7),
                Pizza("Combination", 4,3,5),
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
                Pizza("Pepperoni", 6,5,7),
                Pizza("Combination", 4,3,5),
            ),
            arrayOf(
                OrderItem("Pepperoni", "Large", 4),
                OrderItem("Combination", "Medium", 1),
            )
        ))
    }
}