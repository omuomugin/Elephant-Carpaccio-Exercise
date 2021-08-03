import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Test

class DiscountCalculationRunnerTest {
    @Test
    fun testRun_below_1000() {
        // Arrange
        val totalPrice = 800.0

        // Action
        val actual = DiscountCalculationRunner().run(totalPrice)

        // Expect
        val expected = 800.0

        // Assert
        Assert.assertThat(actual, CoreMatchers.`is`(expected))
    }

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

    @Test
    fun testRun_over_5000() {
        // Arrange
        val totalPrice = 5000.0

        // Action
        val actual = DiscountCalculationRunner().run(totalPrice)

        // Expect
        val expected = 4750.0

        // Assert
        Assert.assertThat(actual, CoreMatchers.`is`(expected))
    }

    @Test
    fun testRun_over_7000() {
        // Arrange
        val totalPrice = 7000.0

        // Action
        val actual = DiscountCalculationRunner().run(totalPrice)

        // Expect
        val expected = 6510.0

        // Assert
        Assert.assertThat(actual, CoreMatchers.`is`(expected))
    }
}