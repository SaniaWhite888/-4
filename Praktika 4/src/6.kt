fun main() {
    val secretNumber = (1..100).random()
    var guess = 0
    var attempts = 0

    while (guess != secretNumber) {
        print("Угадайте число (от 1 до 100): ")
        guess = readLine()!!.toInt()
        attempts++

        when {
            guess > secretNumber -> println("Число слишком большое")
            guess < secretNumber -> println("Число слишком маленькое")
        }
    }

    println("Поздравляем! Вы угадали число за $attempts попыток.")
}