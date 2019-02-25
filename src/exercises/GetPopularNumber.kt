package exercises

fun main(){

}

fun getPopularNumber(numbers: IntArray): Int {
    var count = 1
    var tempCount: Int
    var popular = numbers[0]
    var temp : Int
    for (i in 0 until numbers.size - 1) {
        temp = numbers[i]
        tempCount = 0
        for (j in 1 until numbers.size) {
            if (temp == numbers[j])
                tempCount++
        }
        if (tempCount > count) {
            popular = temp
            count = tempCount
        }
    }
    return popular
}