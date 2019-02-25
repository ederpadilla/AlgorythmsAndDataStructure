package datastructure

class CustomStackLinkedList <T>() {

    var top : Node?=null

    init {
        this.top = null
    }

    fun push(newNodeValue : Any) {
        val newNode = Node(newNodeValue, null)
        if (top == null)
            top = newNode
        else {
            newNode.next = top
            top = newNode
        }
    }

    fun pop() : T? {
        if (top!=null){
            val value = top!!.value as T
            top = top!!.next
            return value
        }else{
            throw Throwable("Is null bro 😬")
            return null
        }
    }

    fun display() {
        var node = top
        while (node != null) {
            println("Node value: ${ (node.value as T).toString()}")
            node = node.next
        }
    }



}
