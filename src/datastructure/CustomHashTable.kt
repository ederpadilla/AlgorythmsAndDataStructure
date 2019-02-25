package datastructure

import java.util.ArrayList
import java.util.HashMap

class CustomHashTable<T>(internal var size: Int) {

    internal var arrayHash: Array<HashEntry>

    init {
        arrayHash = Array(size){HashEntry()}
        for (i in 0 until size) {
            arrayHash[i] = HashEntry()
        }
    }

    fun getHash(key: Int): Int {
        return key % size //get value
    }

    fun put(key: Int, value: Any) {
        val hashIndex = getHash(key)
        val arrayValue = arrayHash[hashIndex]
        val nextEnter = HashEntry(key, value)
        nextEnter.next = arrayValue.next
        arrayValue.next = nextEnter
    }

    operator fun get(key: Int): T? {
        var value: T? = null
        val hashIndex = getHash(key)
        var arrayValue: HashEntry? = arrayHash[hashIndex]
        while (arrayValue != null) {
            if (arrayValue.key == key) {
                value = arrayValue.value as T
                break
            }
            arrayValue = arrayValue.next
        }


        return value
    }

}
