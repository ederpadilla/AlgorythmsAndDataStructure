package exercises

fun main(){
    //println("Año dividido ${divideYear(2019)}")
    val test = intArrayOf(1, 4, 10, 4, 2)

    val test2 = intArrayOf(1, 2, 1, 2)

    val test3 = intArrayOf(1, 3, 2)

    val test4 = intArrayOf(1, 3, 2, 1)
    //println("almostIncreasingSequence = [" + almostIncreasingSequence(test) + "]")
    //println("almostIncreasingSequence = [" + almostIncreasingSequence(test2) + "]")
    //println("almostIncreasingSequence = [" + almostIncreasingSequence(test3) + "]")

    println("almostIncreasingSequence = [" + almostIncreasingSequence(test4) + "]")
}

fun divideYear(year : Int) : Int{
    if (year % 100 ==0){
        return (year/100)
    }
    return year/100 +1

}
fun almostIncreasingSequence(sequence: IntArray): Boolean {
    var removed = 0

    var i = 0
    while (i < sequence.size - 2 && removed <= 2) {
        val a = sequence[i]
        val b = sequence[i + 1]
        val c = sequence[i + 2]
        if (a >= b) {
            removed++
            sequence[i] = b - 1
        }
        if (b >= c) {
            removed++
            if (a == c) {
                sequence[i + 2] = b + 1
            } else {
                sequence[i + 1] = a
            }
        }
        i++

    }

    return removed <= 1
}