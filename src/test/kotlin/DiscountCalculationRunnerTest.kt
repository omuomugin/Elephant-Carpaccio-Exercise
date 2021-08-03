import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class DiscountCalculationRunnerTest {
    @Test
    fun testRun_over_1000() {
        // Arrange
        val totalPrice = 3000.0

        // Action
        val actual = DiscountCalculationRunner().run(totalPrice)

        // Expect
        val expected = 2910.0

        // Assert
        Assert.assertThat(actual, CoreMatchers.`is`(expected))
    }
}