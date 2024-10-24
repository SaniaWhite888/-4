fun main() {
    print("Введите код ошибки (100, 200, 300): ")
    val errorCode = readLine()!!.toInt()

    when (errorCode) {
        100 -> println("Ошибка сети.")
        200 -> println("Ошибка сервера.")
        300 -> println("Ошибка доступа.")
        else -> println("Неизвестный код ошибки.")
    }
}