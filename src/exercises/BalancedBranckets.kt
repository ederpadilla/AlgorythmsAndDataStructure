package exercises

import java.util.*
import java.util.Stack



fun main(){
    println("Are balanced ${areBalancedBrackets("{}")}")
}

fun areBalancedBrackets(input: String): Boolean {
    val stack = Stack<Char>()
    val size = input.length.dec()
    for (i in 0..size){
        val char = input[i]
        println("Char $char")
        if (char=='{' || char=='(' || char=='['){//||
            //char=='}' || char==')' || char==']'){
            stack.push(char)
        } else {
            if (char == '}'){
                if (stack.isEmpty() || (stack.pop()!='{')){
                    return false
                }

            }else if (char == ')'){
                if (stack.isEmpty() || (stack.pop()!='(')){
                    return false
                }

            }else if (char == ']'){
                if (stack.isEmpty() || (stack.pop()!='[')){
                    return false
                }
            }
        }
    }
    /*val secondStack = Stack<Char>()
    val secondSize = stack.size.dec()
    for (i in 0..secondSize){
        val char = input[i]
        if (char=='{' || char=='(' || char=='['){
            secondStack.push(char)
        }else if (char == '}'){
            if (secondStack.isEmpty() || (secondStack.pop()!='{')){
                return false
            }

        }else if (char == ')'){
            if (secondStack.isEmpty() || (secondStack.pop()!='(')){
                return false
            }

        }else if (char == ']'){
            if (secondStack.isEmpty() || (secondStack.pop()!='[')){
                return false
            }
        }
    }*/
    return stack.isEmpty()
}

