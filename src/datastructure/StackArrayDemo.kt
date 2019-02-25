package datastructure

import java.util.*

fun main(){
/*    val stack = CustomStackArray<Int>(5)
    stack.push(10)
    stack.push(11)
    stack.push(12)
    stack.push(13)
    stack.push(14)
    while (!stack.isEmpty()) {
        println("Stack pop ${stack.pop()}")
    }*/

    val stack = Stack<Int>()
    stack.push(10)
    stack.push(11)
    stack.push(12)
    stack.push(13)
    stack.push(14)
    while (!stack.isEmpty()) {
        println("Stack pop ${stack.pop()}")
    }

/*    val stackDynamic = CustomDynamicStackArray<Int>(2)
    stackDynamic.push(12)
    stackDynamic.push(13)
    println("Size is ${stackDynamic.size}")
    stackDynamic.push(15)
    stackDynamic.push(16)
    stackDynamic.push(17)
    println("Size is ${stackDynamic.size}")*/
}