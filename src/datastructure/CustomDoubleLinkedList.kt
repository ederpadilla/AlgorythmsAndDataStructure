package datastructure


class CustomDoubleLinkedList<T> {

    var head : DoubleNode ? =null

    init {
        head = null
    }

    fun add(value : Any){

        val newNode = DoubleNode(value,null,null)
        if (head==null)
            head = newNode
        else{
            newNode.next = head
            head!!.previus = newNode
            head = newNode
        }
    }

    fun delete(){
        head = head!!.next
        head!!.previus = null
    }

    fun display(){
        var node = head
        while (node != null) {
            println("Node value: " + node.value as T)
            node = node.next
        }
    }

}