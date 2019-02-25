package datastructure

import java.util.Arrays

class DynamicArray<T> {

    internal var data: Array<Any>
    internal var size: Int = 0

    init {
        this.size = 0
        this.data = Array(size){Any()}
    }

    fun getSize(): Int {
        return data.size
    }

    operator fun get(index: Int): T {
        return data[index] as T
    }

    fun put(element: Any) {
        ensureCapacity(size + 1)
        data[size++] = element
    }

    fun ensureCapacity(minCapacity: Int) {
        val oldCapacity = getSize()
        if (minCapacity > oldCapacity) {
            var newCapacity = oldCapacity * 2
            if (newCapacity < minCapacity)
                newCapacity = minCapacity
            data = Arrays.copyOf(data, newCapacity)
        }
    }
}