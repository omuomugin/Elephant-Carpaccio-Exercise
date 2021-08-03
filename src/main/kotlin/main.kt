fun main(args: Array<String>) {
    val numbersOfItems = args[0].toInt()
    val pricePerItem = args[1].toDouble()
    val stateCode = args[2]

    val result = CalculationRunner().run(
        numbersOfItems = numbersOfItems,
        pricePerItem = pricePerItem,
        stateCode = stateCode
    )

    val discountedResult = DiscountCalculationRunner().run(result)

    println(discountedResult)
}