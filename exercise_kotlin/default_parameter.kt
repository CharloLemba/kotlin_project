fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"
    println(displayAlertMessage(operatingSystem, emailId))

    val operatingSystem2 = "Windows"
    val emailId2 = "user_two@gmail.com"
    println(displayAlertMessage(operatingSystem2, emailId2))
    
    val operatingSystem3 = "Mac OS"
    val emailId3 = "user_three@gmail.com"
    println(displayAlertMessage(operatingSystem3, emailId3))
}

fun displayAlertMessage(operatingSystem: String, emailId: String): String{
    return ("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}