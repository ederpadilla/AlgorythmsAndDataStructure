package exercises

import java.io.Console



fun main(){
writeWizeline()
}
fun writeWizeline(){
    for (i in 1..100) {
        val wize = i % 3 == 0
        val line = i % 5 == 0

        if (wize && line)
            println("Wizeline")
        else if (wize)
            println("Wize")
        else if (line)
            println("line")
        else
            println(i)
    }
}