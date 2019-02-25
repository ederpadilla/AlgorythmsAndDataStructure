package exercises

fun main(){
    println("Año dividido ${divideYear(2019)}")
}

fun divideYear(year : Int) : Int{
    if (year % 100 ==0){
        return (year/100)
    }
    return year/100 +1

}