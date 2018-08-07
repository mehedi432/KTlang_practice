/*
* Conditional Logic -
* Conditional logic are same as the JavaScript of C++ and the Syntax
* are also the same so, it is pretty beautiful and nice
* There is a nice alternative to the switch case which is 'when'
* */

fun main(args: Array<String>) {
//
//    val x = 2
//    val y = 3
//
//    if (x == y){
//        println("A is equal to B")
//    }
//
//    if(x != y){
//        println("A is not equal to B")
//    }
//
//    val accountBalance = 100
//    val price = 89
//
//    if(accountBalance >= price){
//        println("You can Buy it")
//    } else{
//        println("Sorry! you don't have enough Money")
//    }
//
//    val degrees = 70
//    if (degrees >= 70){
//        println("It is too hot")
//    } else if (degrees < 20 && degrees == 70 ){
//        println("Weather is not good. Wear sweater")
//    } else {
//        print("No Weather :(")
//    }
//
//    val isHungry = true
//    val isBored = false
//
//    if (!isHungry || !isBored){
//        println("Using !(not) operator for changing Boolean State")
//    }
//
//    if(!isBored && isHungry){
//        println("Holly Crap!!!! This is Working")
//    }
//
//    if(isHungry == false || isBored == false){
//        println("Checking two boolean value")
//    }

//    Switch-Case for kotlin
//    ----------------------

//    println("Enter a Number for checking the when statement: ")
//    val x = readLine()!!.toInt()
//    val x = 2
//    when(x){
//        1 -> println("x == 1")
//        2 -> println("x !==2")
//        else -> println("X does not equal 1 or 2")
//    }
    println("Please Enter your feeling's: ")
    fun feelings(){
        val checkMood = readLine()

        when(checkMood){
            "angry" -> println("$checkMood feeling")
            "sad" -> println("$checkMood feeling")
            "floppy" -> println("$checkMood feeling")
            else -> println("You don't have enough Emotions")
        }
    }
    feelings()
}
