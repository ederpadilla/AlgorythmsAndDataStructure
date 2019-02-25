package datastructure

class CustomLinkedList<T> {

    internal var head: Node? = null

    init {
        this.head = null
    }

    fun add(value: Any) {
        val newNode = Node(value, null)
        if (head == null)
            head = newNode
        else {
            newNode.next = head
            head = newNode
        }
    }

    fun delete() {
        head = head!!.next
    }

    fun display() {
        var node = head
        while (node != null) {
            println("Node value: " + node.value as T)
            node = node.next
        }
    }
}
