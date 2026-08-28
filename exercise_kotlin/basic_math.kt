// fun main() {
//     val firstNumber = 10
//     val secondNumber = 5
//     val result = firstNumber + secondNumber

//     println("$firstNumber + $secondNumber = $result")
// }

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    
    val substract = substract(firstNumber, secondNumber)
    val anotherSubstract = substract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    
    println("$firstNumber - $secondNumber = $substract")
    println("$firstNumber - $thirdNumber = $anotherSubstract")
}

fun add(firstNumber: Int, secondNumber: Int): Int{
    return firstNumber + secondNumber
}

fun substract (firstNumber: Int, secondNumber: Int): Int{
    return firstNumber - secondNumber
}