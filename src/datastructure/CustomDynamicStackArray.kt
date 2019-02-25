package datastructure

import java.util.*


class CustomDynamicStackArray<T>(var size : Int) {

    var arrayStack : Array<Any> = Array(size) { Any() }

    var top = -1

    fun push (newItem : Any){
        ensureCapacity(top+2)

            top += 1
            arrayStack[top] = newItem

    }

    fun ensureCapacity(minCapacity: Int) {
        val oldCapacity = arrayStack.size
        if (minCapacity > oldCapacity) {
            var newCapacity = oldCapacity * 2
            if (newCapacity < minCapacity)
                newCapacity = minCapacity
            arrayStack = Arrays.copyOf(arrayStack, newCapacity)
        }
    }

    fun isFull() : Boolean{
        return (top==(size-1))
    }

    fun pop() : T{
        if(!isEmpty()){
            val item = arrayStack[top] as T
            top -= 1
            return item
        }else{
            throw Throwable("Is empty dude ")
        }
    }

    fun isEmpty() : Boolean{
        return top==-1
    }

}