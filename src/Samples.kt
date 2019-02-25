fun main(args : Array<String>){
    //println("Reverse int ${firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof")}")
    val test = test()
    //test.test("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof")
    System.out.println("Result "+test.test("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe"))
    //test.test2()
}

fun secondRevers(string : String) : String{
    var reversed = ""
    for (index in string.indices ){
        reversed += string[string.length-1-index]
    }
    return reversed
}
fun thirdReverse(string : String) : String{
    return string.split(' ').reduce { reversed, character ->
        return character+reversed
    }
}

fun isPalindrome1(string: String) : Boolean{
    var reversed = ""
    val word = string.trim().toLowerCase().replace(" ","")
    val indices = word.indices
    for (i in word.length.dec() downTo 0){
        reversed += word[i]
    }
    //for (index in indices){
    //    reversed += word[word.length-1-index]
    //}
    return reversed == word
}

fun reverseInt(input : Int) : Int{
    val str = input.toString()
    var reversed = ""
    for (temp in str.indices) {
        if (str[0].equals("-")&&temp==0){
            reversed = "-"
        }else{
            reversed += str[str.length.dec()-temp]
        }
        println(reversed)

    }
    return 0
}
fun reverse(x: Int): Int {
    var x = x
    var rev = 0
    while (x != 0) {
        rev = rev * 10 + x % 10
        x = x / 10
    }

    return rev
}
fun isPalindromeParPro(string: String) : Boolean{
    var j: Int
    for (i in string.length.dec() downTo 0){
        j = string.length.dec()-i
        if (j>=i) {
            break
        }
        if (string[i]!=string[j]) {
            return false
        }
    }
    return true
}


fun firstNotRepeatingCharacter(string: String): Char {
    val englishLetters = IntArray(26)
    val data = Array(26) { IntArray(string.length.dec()) }
    for (index  in 0..string.length.dec()){
        println("Position of char inside string = $index")
        englishLetters[getPositionOfChar(string[index])] += 1
        //97  bidimencional index
    }


    for (index in 0..englishLetters.size.dec()){
        if (englishLetters[index]!=0){
            if (englishLetters[index]<2){
                //println("Indexxx $index")
                //println("Char at ${getCharOfPosition(index)} ")
                //println("String at index $index ${string[index]} ")
                return getCharOfPosition(index)
            }
        }

    }
    return '_'
}
fun getPositionOfChar(char : Char) : Int{
    when(char){
        'a'-> return 0

        'b'-> return 1

        'c'-> return 2

        'd'-> return 3

        'e'-> return 4

        'f'-> return 5

        'g'-> return 6

        'h'-> return 7

        'i'-> return 8

        'j'-> return 9

        'k'-> return 10

        'l'-> return 11

        'm'-> return 12

        'n'-> return 13

        'o'-> return 14

        'p'-> return 15

        'q'-> return 16

        'r'-> return 17

        's'-> return 18

        't'-> return 19

        'u'-> return 20

        'v'-> return 21

        'w'-> return 22

        'x'-> return 23

        'y'-> return 24

        'z'-> return 25
    }
    return 0
}
fun getCharOfPosition(pos : Int) : Char{
    when(pos){
        0-> return 'a'
        1-> return 'b'
        2-> return 'c'
        3-> return 'd'
        4-> return 'e'
        5-> return 'f'
        6-> return 'g'
        7-> return 'h'
        8-> return 'i'
        9-> return 'j'
        10-> return 'k'
        11-> return 'l'
        12-> return 'm'
        13-> return 'n'
        14-> return 'o'
        15-> return 'p'
        16-> return 'q'
        17-> return 'r'
        18-> return 's'
        19-> return 't'
        20-> return 'u'
        21-> return 'v'
        22-> return 'w'
        23-> return 'x'
        24-> return 'y'
        25-> return 'z'
    }
    return 'z'
}
fun test(string: String): Char? {
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
        string[englishWords[firstDuplicatePos][1]]
    } else {
        '_'
    }
}