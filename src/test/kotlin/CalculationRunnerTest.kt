import org.hamcrest.CoreMatchers.`is`
import org.junit.Test
import org.junit.Assert.assertThat

class CalculationRunnerTest {
    @Test
    fun testRun() {
        // Arrange
        val numbersOfItems = 1
        val pricePerItem = 2

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem)

        // Expect
        val expected = 2

        // Assert
        assertThat(actual, `is`(expected))
    }
}