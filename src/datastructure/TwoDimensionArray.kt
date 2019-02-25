package datastructure

fun main (args : Array<String>){

    val twoDimension = Array(3) { IntArray(3) }
    twoDimension[0][0] = 1
    twoDimension[0][1] = 2
    twoDimension[0][2] = 4
    twoDimension[1][0] = 5
    twoDimension[1][1] = 8
    twoDimension[1][2] = 12
    twoDimension[2][0] = 0
    twoDimension[2][1] = 0
    twoDimension[2][2] = 0
    for (i in 0..twoDimension.size.dec()){
        for (j in 0..twoDimension.size.dec()){
            if (i==j){
                println("Equal ${twoDimension[i][j]}")
            }
            //println("Dta[i][j] ${twoDimension[i][j]} ")
        }
    }

}