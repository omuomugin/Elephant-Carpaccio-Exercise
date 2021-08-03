fun main(args: Array<String>) {
    val numbersOfItems = args[0].toInt()
    val pricePerItem = args[1].toDouble()

    val result = CalculationRunner().run(numbersOfItems = numbersOfItems, pricePerItem = pricePerItem)

    println(result)
}