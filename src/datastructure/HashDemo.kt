package datastructure

fun main() {
    val customHashTable  = CustomHashTable<String>(10)
    customHashTable.put(11,"Eder")
    customHashTable.put(12,"Eder 12")
    customHashTable.put(13,"Eder 13")
    customHashTable.put(14,"Eder 14")
    customHashTable.put(15,"Eder 15")
    customHashTable.put(16,"Eder 16")
    customHashTable.put(17,"Eder 17")
    println("Wanna get an specific ${customHashTable.get(11)}")
}

