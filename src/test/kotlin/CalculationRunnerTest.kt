import org.hamcrest.CoreMatchers.`is`
import org.junit.Test
import org.junit.Assert.assertThat
import org.junit.Assert.fail

class CalculationRunnerTest {
    @Test
    fun testRun_UT() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0
        val stateCode = "UT"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 16.03

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_NV() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0
        val stateCode = "NV"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 16.21

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_TX() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0
        val stateCode = "TX"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 15.94

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_AL() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0
        val stateCode = "AL"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 15.61

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_CA() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 5.0
        val stateCode = "CA"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 16.24

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_price_below_1dollar() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 0.50
        val stateCode = "UT"

        // Action
        val actual = CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)

        // Expect
        val expected = 1.61

        // Assert
        assertThat(actual, `is`(expected))
    }

    @Test
    fun testRun_error_invalid_stateCode() {
        // Arrange
        val numbersOfItems = 3
        val pricePerItem = 0.50
        val stateCode = "XX"

        try {
            CalculationRunner().run(numbersOfItems, pricePerItem, stateCode)
        } catch (e: IllegalArgumentException) {
            // pass
            return
        }

        fail()
    }
}