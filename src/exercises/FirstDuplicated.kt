package exercises

fun main(){

}

fun firstDuplicate(list: Array<Int>): Int {
    val arrayOfZeros = IntArray(list.size)
    when {
        list.size==1 -> return -1
        list.size==2 -> {
            if (list[0] == list[1])
                return list[0]
            return -1
        }
        else -> {
            var i = 0
            while (i < list.size) {
                if (arrayOfZeros[list[i]-1] == 1)
                    return list[i]
                arrayOfZeros[list[i]-1] = 1
                i++
            }
            if (i == list.size) return -1
        }
    }
    return -1
}