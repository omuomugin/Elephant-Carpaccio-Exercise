fun main(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()

    val result = CalculationRunner().run(a, b)

    println(result)
}