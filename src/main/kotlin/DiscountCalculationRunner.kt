import kotlin.math.ceil

class DiscountCalculationRunner {

    companion object {
        private const val DISCOUNT_RATE_OVER_1000 = 0.97
        private const val DISCOUNT_RATE_OVER_5000 = 0.95
        private const val DISCOUNT_RATE_OVER_7000 = 0.93
        private const val DISCOUNT_RATE_OVER_10000 = 0.90
        private const val DISCOUNT_RATE_OVER_50000 = 0.85
    }

    fun run(totalPrice: Double): Double {
        val discountRate = when {
            totalPrice >= 50000 -> DISCOUNT_RATE_OVER_50000
            totalPrice >= 10000 -> DISCOUNT_RATE_OVER_10000
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