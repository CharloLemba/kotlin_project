fun main(){
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println("Time Spent Today = $timeSpentToday")
    println("Time Spent Yesterday = $timeSpentYesterday")
    println(comparison(timeSpentToday, timeSpentYesterday))
    println()
    
    val timeSpentToday2 = 300
    val timeSpentYesterday2 = 300
    println("Time Spent Today = $timeSpentToday2")
    println("Time Spent Yesterday = $timeSpentYesterday2")
    println(comparison(timeSpentToday2, timeSpentYesterday2))
    println()
    
    val timeSpentToday3 = 200
    val timeSpentYesterday3 = 220
    println("Time Spent Today = $timeSpentToday3")
    println("Time Spent Yesterday = $timeSpentYesterday3")
    println(comparison(timeSpentToday3, timeSpentYesterday3))
    println()
    
    val timeSpentToday4 = 400
    val timeSpentYesterday4 = 300
    println("Time Spent Today = $timeSpentToday4")
    println("Time Spent Yesterday = $timeSpentYesterday4")
    println(comparison(timeSpentToday4, timeSpentYesterday4))
    println()
}

fun comparison(timeSpentToday: Int, timeSpentYesterday: Int): Boolean{
    if (timeSpentToday > timeSpentYesterday){
        return true
    }
    else{
        return false
    }
}