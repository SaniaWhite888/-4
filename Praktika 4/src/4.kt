fun main() {
    print("Введите время в формате 24-часового формата (например, 15:30): ")
    val time = readLine()!!
    val hours = time.substringBefore(":").toInt()

    when (hours) {
        in 0..5 -> println("Ночь")
        in 6..11 -> println("Утро")
        in 12..17 -> println("День")
        in 18..23 -> println("Вечер")
    }
}