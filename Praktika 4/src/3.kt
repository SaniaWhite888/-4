fun main() {
    print("Введите оценку (0-100): ")
    val grade = readLine()!!.toInt()

    when (grade) {
        in 90..100 -> println("Отлично")
        in 80..89 -> println("Хорошо")
        in 70..79 -> println("Удовлетворительно")
        in 60..69 -> println("Неудовлетворительно")
        else -> println("Неверная оценка")
    }
}