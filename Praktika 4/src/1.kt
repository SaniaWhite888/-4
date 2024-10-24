fun main() {
    print("Введите номер дня недели (1-7): ")
    val dayNumber = readLine()!!.toInt()

    when (dayNumber) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Неверный номер дня недели")
    }
}