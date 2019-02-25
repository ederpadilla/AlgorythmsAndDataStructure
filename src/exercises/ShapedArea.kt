package exercises

fun main(){
   println("Shaped Area ${shapedArea(2)}")
}
fun shapedArea(number : Int) : Int {
    val indexNumber = (number*2)-1
    var result = 0
    var acc = 0
    while (result != number){

        if (result == 0)
            acc = indexNumber
        else
            acc += indexNumber - result * 2
        result++
    }

    acc = acc * 2 - indexNumber
    return acc
}