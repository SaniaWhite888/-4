fun main() {
    print("Введите способ оплаты (наличные, кредитная карта, PayPal): ")
    val paymentMethod = readLine()!!.lowercase()

    when (paymentMethod) {
        "наличные" -> println("Оплата наличными принята.")
        "кредитная карта" -> println("Введите данные кредитной карты.")
        "paypal" -> println("Оплата через PayPal.")
        else -> println("Неверный способ оплаты.")
    }
}