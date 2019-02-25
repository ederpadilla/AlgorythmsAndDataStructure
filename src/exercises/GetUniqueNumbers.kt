package exercises

fun main(){

    val arraySample = intArrayOf(1,3,5,5,6,6,7,8,10,10)
    println("Unique numbers ${getUniqueNumbers(arraySample)}")
}
fun getUniqueNumbers(numbers:IntArray) : ArrayList<Int>{
    val uniqueNumbers = ArrayList<Int>()
    val numbersHashMap = HashMap<Int,Int>()
    val size = numbers.size.dec()
    for (index in 0..size){
        if (numbersHashMap[numbers[index]] !=null) {
            val frequency = numbersHashMap[numbers[index]]
            numbersHashMap[numbers[index]] = frequency!!+1
        }
        else{
            numbersHashMap[numbers[index]] = 1
        }
    }
    for (key in numbersHashMap.keys){
        if (numbersHashMap[key]==1){
            uniqueNumbers.add(key)
        }
    }
    return uniqueNumbers
}