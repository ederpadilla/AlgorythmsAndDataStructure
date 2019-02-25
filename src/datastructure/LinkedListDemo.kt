package datastructure

import java.util.*

fun main (args : Array<String>){
    val linkedList = CustomLinkedList<String>()
    linkedList.add("One")
    linkedList.add("Two")
    linkedList.add("Three")
    linkedList.add("Four")
    linkedList.add("Five")
    linkedList.display()
    println("Before Delete")
    linkedList.delete()
    println("After Delete")
    linkedList.display()
    val linkedListDouble = CustomDoubleLinkedList<String>()
    linkedListDouble.add("One Double")
    linkedListDouble.add("Two Double")
    linkedListDouble.add("Three Double")
    linkedListDouble.add("Four Double")
    linkedListDouble.add("Five Double")
    linkedListDouble.display()
    println("Before Delete")
    linkedListDouble.delete()
    println("After Delete")
    linkedListDouble.display()

}

