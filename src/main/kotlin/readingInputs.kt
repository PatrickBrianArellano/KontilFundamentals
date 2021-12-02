import java.time.LocalDate
fun main(){
    println("What is your name?")
    val yourName = readLine()
    println("What is your birthday?")
    val yourBday = readLine()!!

    //simple method
    //sample input
    //name: Patrick, birthday: 1998
    //solution #1
    println("Your name is $yourName and you're ${2021 - yourBday.toInt()} years old.")

    //complex method but without using library
    //sample input
    //name: Patrick, birthday: April 28, 1998
    //solution #2
    //println("Your name is $yourName and you're ${2021 - yourBday.substring(yourBday.length-4,
    //    yourBday.length).toInt()} years old.")

    //complex method with library
    //sample input
    //name: Patrick, birthday: 1998-04-28
    //solution #3
    //val yourAge = (LocalDate.parse(yourBday)).until(LocalDate.now())
    //println("Your name is $yourName and you're ${yourAge.years} years, ${yourAge.months} " +
    //        "months and ${yourAge.days}days old.")
}