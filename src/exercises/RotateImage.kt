package exercises

fun main(){
    //rotate()
    rotateImage()

    val test : MutableList<MutableList<Int>> = mutableListOf()
}
fun rotate(){
    val numbers = Array(9) { IntArray(3) }
    numbers[0][0] = 2
    numbers[0][1] = 3
    numbers[0][2] = 4
    numbers[1][0] = 5
    numbers[1][1] = 6
    numbers[1][2] = 7
    numbers[2][0] = 8
    numbers[2][1] = 9
    numbers[2][2] = 0
    for (index in 0..2){
        for (jdex in 0..2){

            println(" ${numbers[index][jdex]} ")
        }
    }

}
fun rotateImage() {
    val array = Array(3) {IntArray(3)}

    array[0][0] = 0
    array[0][1] = 1
    array[0][2] = 2
    array[1][0] = 3
    array[1][1] = 4
    array[1][2] = 5
    array[2][0] = 6
    array[2][1] = 7
    array[2][2] = 8
    for (index in 0..array.size.dec()){
        for (j in 0..array.size.dec()){
            println(" ${array[index][j]}")
        }
    }
}

