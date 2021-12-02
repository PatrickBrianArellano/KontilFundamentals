fun main(){
    val myMessage = "Happy Birthday! Justin!"
    val anotherMessage = "Happy Birthday! Justin!"

    println(myMessage)

    println(myMessage.substring(16,22)) //output Justin
    println(myMessage.subSequence(16,22)) //output Justin

    println(myMessage.compareTo(anotherMessage))

    //contains checks if the word is in the string/sentence
    println(myMessage.contains("Justin")) //true
    println(myMessage.contains("Patrick")) //false

    //startsWith for checking a common first word
    val boyName = "Mr. Patrick"
    val girlName = "Ms. Andrea"

    println(boyName.startsWith("Mr")) //true
    println(girlName.startsWith("Mr")) //false

    //take method for printing the character sequence from 0 index until the nth letter
    println(myMessage.take(5)) //Happy

    //removePrefix for removing a first word/sequence of characters
    println(boyName.removePrefix("Mr. ")) //Patrick

    //change a specific word/sequence to a new one
    println(myMessage.replace("Justin","Patrick")) //Happy Birthday! Patrick!

    val givenName = "Patrick Brian"
    val surName = "Arellano"
    val middleName = "Veneracion"

    var fullName = "$givenName $middleName $surName"

    println("My full name is $givenName ${middleName.first()} $surName")
    println("My full name is $fullName")
    
    val myAge = 0
    println("My age 10 years from now is ${myAge + 10}")

    val nickName = "patrick"
    val product = 100
    val amount = 10

    println("${nickName.first().uppercaseChar()}${nickName.substring(1)} will pay ${product * amount}.")



}