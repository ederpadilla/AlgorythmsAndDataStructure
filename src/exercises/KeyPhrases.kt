package exercises

fun main(){

    var text = "They will come and this video or I will solve a problem that I created an Amazon interview.\n" +
            "\n" +
            "The problem was this If you have a text find that important ward and the text so you want to know that\n" +
            "\n" +
            "the person who wrote The Who wrote the text.\n" +
            "\n" +
            "What is there most word that he foresaw.\n" +
            "\n" +
            "So this type of algorithm knowing we name it key phrase it that you find the important word and that\n" +
            "\n" +
            "takes.\n" +
            "\n" +
            "So just to get started I want to analyze this a problem.\n" +
            "\n" +
            "So how I could find important words First of all I find every word in the text I find how many times\n" +
            "\n" +
            "this for repeated and the word that gets repeated more trust me in this world is more important.\n" +
            "\n" +
            "So this will naturally with turn time.\n" +
            "\n" +
            "And this one a five time.\n" +
            "\n" +
            "So this one is more important.\n" +
            "\n" +
            "But there are some wars I had to exclude them because this was deck could appear in any ticks which"
    var wordsToExclude = ArrayList<String>()
    wordsToExclude.add("the")
    wordsToExclude.add("a")
    wordsToExclude.add("by")
    wordsToExclude.add("to")
    wordsToExclude.add("and")
    wordsToExclude.add("of")
    wordsToExclude.add(",")
    wordsToExclude.add(".")
    wordsToExclude.add("is")
    wordsToExclude.add("are")
    val stringArray = text.replace("\n", " ")
        .replace("\r", " ")
        .replace(".","")
        .trim()
        .toLowerCase()
        .split(" ")


    maxFreqWords(stringArray,wordsToExclude)
}

fun maxFreqWords(stringArray: List<String>, wordsToExclude: ArrayList<String>) {
    var maxFreq = -1
    val repeatedWords = HashMap<String,Int>()
    for (key in stringArray){
        if (!wordsToExclude.contains(key) &&!key.isEmpty()){
            if (repeatedWords[key]==null)
                repeatedWords[key] = 1
            else{
                val frequency = repeatedWords.get(key)?.plus(1)
                repeatedWords[key] = frequency!!
            }
            if (repeatedWords[key]!! >maxFreq){
                maxFreq = repeatedWords.get(key)!!
            }
        }

    }
    for (key in repeatedWords.keys){
        if (repeatedWords.get(key)==maxFreq)
            println("Key $key : ${repeatedWords[key]}")
    }
}

