import kotlin.math.ceil

class DiscountCalculationRunner {

    companion object {
        private const val DISCOUNT_RATE_OVER_1000 = 0.97
        private const val DISCOUNT_RATE_OVER_5000 = 0.95
        private const val DISCOUNT_RATE_OVER_7000 = 0.93
    }

    fun run(totalPrice: Double): Double {
        val discountRate = when {
            totalPrice >= 7000 -> DISCOUNT_RATE_OVER_7000
            totalPrice >= 5000 -> DISCOUNT_RATE_OVER_5000
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