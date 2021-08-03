import org.hamcrest.CoreMatchers.`is`
import org.junit.Test
import org.junit.Assert.assertThat

class CalculationRunnerTest {
    @Test
    fun testRun() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem)

        // Expect
        val expected = 16.03

        // Assert
        assertThat(actual, `is`(expected))
    }
}