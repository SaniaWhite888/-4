fun main() {
    print("Введите страну (США, Россия, Япония): ")
    val country = readLine()!!.uppercase()

    when (country) {
        "США" -> println("Национальность: Американец")
        "РОССИЯ" -> println("Национальность: Россиянин")
        "ЯПОНИЯ" -> println("Национальность: Японец")
        else -> println("Неизвестная страна.")
    }
}