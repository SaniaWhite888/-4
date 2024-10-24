fun main() {
    print("Введите число: ")
    val number = readLine()!!.toDouble()

    when {
        number > 0 -> println("Число положительное")
        number < 0 -> println("Число отрицательное")
        else -> println("Число равно нулю")
    }
}