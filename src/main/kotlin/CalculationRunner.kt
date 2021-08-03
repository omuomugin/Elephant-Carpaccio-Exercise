import java.lang.IllegalArgumentException
import kotlin.jvm.Throws
import kotlin.math.ceil

class CalculationRunner {

    @Throws(IllegalArgumentException::class)
    fun run(numbersOfItems: Int, pricePerItem: Double, stateCode: String): Double {
        val taxRate = TaxRate.valueOf(stateCode).taxRate
        val rawPrice = (numbersOfItems * pricePerItem) * taxRate

        // cent should be in range of `0 ~ 99`
        // which means result only can be in format with 2 places of decimals
        // e.g. 1.23, 21.99
        // in fact calculate rule is ceil
        // e.g. 1.234 -> 1.24, 21.989 -> 21.99
        return ceil(rawPrice * 100) / 100
    }
}

enum class TaxRate(val taxRate: Double) {
    UT(1.0685),
    NV(1.08),
    TX(1.0625),
    AL(1.04)
}