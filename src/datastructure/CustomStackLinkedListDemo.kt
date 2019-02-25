package datastructure

fun main(){
    val stackedLinkedList = CustomStackLinkedList<String>()
    stackedLinkedList.push("Test 1")
    stackedLinkedList.push("Test 2")
    stackedLinkedList.push("Test 3")
    stackedLinkedList.pop()
    println("Pop ${stackedLinkedList.display()}")
}