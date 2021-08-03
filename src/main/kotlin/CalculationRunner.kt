import kotlin.math.ceil

class CalculationRunner {

    companion object {
        private const val TAX_RATE_UT = 1.0685f
    }

    fun run(numbersOfItems: Int, pricePerItem: Double, stateCode: String): Double {
        require(stateCode == "UT") { "UT only available for state." }

        val rawPrice = (numbersOfItems * pricePerItem) * TAX_RATE_UT

        // cent should be in range of `0 ~ 99`
        // which means result only can be in format with 2 places of decimals
        // e.g. 1.23, 21.99
        // in fact calculate rule is ceil
        // e.g. 1.234 -> 1.24, 21.989 -> 21.99
        return ceil(rawPrice * 100) / 100
    }
}