package datastructure

object DynamicArrayDemo {

    @JvmStatic
    fun main(args: Array<String>) {
        val integerDynamicArray = DynamicArray<Int>()
        integerDynamicArray.put(11)
        println("Size " + integerDynamicArray.getSize())
        integerDynamicArray.put(12)
        println("Size " + integerDynamicArray.getSize())
        integerDynamicArray.put(13)
        println("Size " + integerDynamicArray.getSize())
        integerDynamicArray.put(14)
        println("Size " + integerDynamicArray.getSize())
        integerDynamicArray.put(15)
        println("Size " + integerDynamicArray.getSize())
        for (i in 0..integerDynamicArray.getSize().dec()) {
            if (integerDynamicArray[i]!=null)
            println("args = [" + integerDynamicArray[i] + "]")
        }
    }
}
