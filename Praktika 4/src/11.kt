fun main() {
    print("Введите группу крови (A, B, AB, O): ")
    val bloodType = readLine()!!.uppercase()

    when (bloodType) {
        "A" -> println("Можно переливать кровь групп A и O.")
        "B" -> println("Можно переливать кровь групп B и O.")
        "AB" -> println("Можно переливать кровь всех групп (A, B, AB, O).")
        "O" -> println("Можно переливать только кровь группы O.")
        else -> println("Неверная группа крови.")
    }
}