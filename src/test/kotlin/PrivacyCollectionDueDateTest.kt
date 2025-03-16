import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrivacyCollectionDueDateTest {
    @Test
    fun example1() {
        Assertions.assertArrayEquals(
            intArrayOf(1, 3),
            PrivacyCollectionDueDate().solution(
                "2022.05.19",
                arrayOf("A 6", "B 12", "C 3"),
                arrayOf("2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C")
            )
        )
    }

    @Test
    fun example2() {
        Assertions.assertArrayEquals(
            intArrayOf(1,4,5),
            PrivacyCollectionDueDate().solution(
                "2020.01.01",
                arrayOf("Z 3", "D 5"),
                arrayOf("2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z")
            )
        )
    }
}