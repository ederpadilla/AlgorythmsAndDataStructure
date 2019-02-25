fun firstNotRepeatingCharacterTwo(string: String): Char {
    val englishWords = Array(26) { IntArray(2) }
    val size = string.length
    for (index in 0 until size) {
        englishWords[string[index].toInt() - 97][1] = index
        englishWords[string[index].toInt() - 97][0] += 1
    }
    var firstDuplicatePos = size
    for (index in 0..25) {
        if (englishWords[index][0] == 1 && englishWords[index][1] < firstDuplicatePos) {
            firstDuplicatePos = englishWords[index][1]
        }
    }
    return if (firstDuplicatePos != size) {
        string[firstDuplicatePos]
    } else {
        '_'
    }
}

