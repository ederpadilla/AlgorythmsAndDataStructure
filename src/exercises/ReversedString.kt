package exercises

fun main(){
    reverseString("Hola mundo")
    println("Biigger reversed ${biggerReversedString("Hola mundo")}")
}
fun reverseString(string : String) : String{
    var reversed = ""
    val arrayWord = string.toCharArray()
    val size = arrayWord.size.dec()
    for (index in size downTo 0){
        reversed += string[index]
    }
    println("Reversed $reversed")
    return reversed
}

fun biggerReversedString(string : String) : String{
    var arrayWord = CharArray(string.length)
    var index = 0
    while (index!= string.length){
        arrayWord[index] = string[index]
        index++
    }

    var secondIndex = 0
    var reversed = ""
    while (secondIndex!= arrayWord.size){
        if (reversed.isEmpty()){
            reversed = "${arrayWord[arrayWord.size-1]}"
        }else{
            reversed += "${(arrayWord[arrayWord.size-(secondIndex+1)])}"
        }
        secondIndex++
    }
    return reversed
}