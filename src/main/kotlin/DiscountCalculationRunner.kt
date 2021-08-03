import kotlin.math.ceil

class DiscountCalculationRunner {

    companion object {
        private const val DISCOUNT_RATE_OVER_1000 = 0.97
    }

    fun run(totalPrice: Double): Double {
        val discountRate = when {
            totalPrice >= 1000 -> DISCOUNT_RATE_OVER_1000
            else -> {
                // no discount
                return totalPrice
            }
        }

        val discountedPrice = totalPrice * discountRate
        return ceil(discountedPrice * 100) / 100
    }
}