package exercises

fun main(){
    val array = arrayOf(1,2,3,4,2,1,4,5)
    println("Adjacent ${adjacentElementsProduct(array)}")
}
fun adjacentElementsProduct(inputArray: Array<Int>): Int {
    var maxValue  = -1000
    var lastValue = 0
    val size = inputArray.size
    for (a in inputArray.indices) {
        if (a != (size-1)){
            lastValue = inputArray[a] * inputArray[a + 1]
        }
        if(maxValue<lastValue){
            maxValue = lastValue
        }
    }
    return maxValue
}