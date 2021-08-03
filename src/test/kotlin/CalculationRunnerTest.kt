import org.hamcrest.CoreMatchers.`is`
import org.junit.Test
import org.junit.Assert.assertThat

class CalculationRunnerTest {
    @Test
    fun testRun() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem)

        // Expect
        val expected = 16.03

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_price_below_1dollar() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 0.50

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem)

        // Expect
        val expected = 1.61

        // Assert
        assertThat(actual, `is`(expected))
    }
}