package exercises

import java.util.*

fun main(){
    val linkedListOne = LinkedList<Int>()
    linkedListOne.add(1)
    linkedListOne.add(5)
    linkedListOne.add(10)
    linkedListOne.add(15)
    linkedListOne.add(20)
    val linkedListTwo = LinkedList<Int>()
    linkedListTwo.add(5)
    linkedListTwo.add(11)
    linkedListTwo.add(12)
    linkedListTwo.add(13)
    linkedListTwo.add(14)
    //orderTwoLinkedList(linkedListOne,linkedListTwo)
}
//***/
fun orderTwoLinkedList(linkedListOne: LinkedList<Int>, linkedListTwo: LinkedList<Int>){
    val finalLinkedList = LinkedList<Int>()
    for (item in 0 until linkedListOne.size){
        for (secondItem in 0 until linkedListTwo.size){
            if (linkedListOne[item]<linkedListTwo[secondItem]){ //how to change with While
                if (!finalLinkedList.contains(linkedListOne[item])) //
                    finalLinkedList.add(linkedListOne[item])
            }else{
                if (!finalLinkedList.contains(linkedListTwo[secondItem]))
                    finalLinkedList.add(linkedListTwo[secondItem])
            }
        }
    }
}

