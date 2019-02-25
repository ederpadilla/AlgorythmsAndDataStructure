package exercises

fun main(){
    println("Is Palindrome ${checkPalindrome("anilavalatina")}")
}

fun checkPalindrome(inputString: String): Boolean {

    return inputString == inputString.reversed()
}