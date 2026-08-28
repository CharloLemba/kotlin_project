fun main(){
    println(weather("Kupang", 27, 31, 82))
    println()
    println(weather("Soe", 32, 36, 10))
    println()
    println(weather("Borong", 59, 64, 2))
    println()
    println(weather("Rote", 50, 55, 7))
    println()
}

fun weather (city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) : String{
    return ("City: $city \n Low Temperature: $lowTemp, High Temperature: $highTemp \n Chance of Rain: $chanceOfRain %".trimMargin())
}