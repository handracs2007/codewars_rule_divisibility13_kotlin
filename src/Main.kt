fun thirt(n: Long): Long {
    val factor = listOf<Int>(1, 10, 9, 12, 3, 4)
    var number = n
    var result: Long

    while (true) {
        result = 0
        number.toString().reversed().forEachIndexed { index, c -> result += ((c - '0') * factor[index % factor.size]) }

        if (number == result)
            break
        else
            number = result
    }

    return result
}

fun main() {
    println(thirt(1234567))
    println(thirt(8529))
    println(thirt(85299258))
}