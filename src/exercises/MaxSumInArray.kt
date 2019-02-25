package exercises

fun main(){
    println("Mas number shouldBe ${maxNumberSumInArray(arrayOf(-1,1))}")
}
fun maxNumberSumInArray (array : Array<Int>) : Int{
    val size = array.size.dec()
    var maxNumber = 0
    var actualSum : Int
    for (index in  0 ..size){
        val secondIndex = size-index
        actualSum =0
        for (j in 0..secondIndex){
            actualSum += array[j+index]
            if (maxNumber<actualSum){
                maxNumber = actualSum
            }
        }
    }
    return maxNumber
}