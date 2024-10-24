fun main() {
    print("Введите длину стороны a: ")
    val a = readLine()!!.toDouble()
    print("Введите длину стороны b: ")
    val b = readLine()!!.toDouble()
    print("Введите длину стороны c: ")
    val c = readLine()!!.toDouble()

    when {
        a + b > c && a + c > b && b + c > a -> {
            when {
                a == b && b == c -> println("Равносторонний треугольник")
                a == b || a == c || b == c -> println("Равнобедренный треугольник")
                else -> println("Разносторонний треугольник")
            }
        }
        else -> println("Треугольник не существует")
    }
}