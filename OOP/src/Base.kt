fun main(args: Array<String>) {
    add(2,1)
    println("The Mult result is ${mult(3, 2)}")
    println("My name is ${name("Mehedi Abdullah")}")
}

//    Function with no return type with parameter
fun add (num1: Int, num2: Int){
    var sum = num1 + num2
    println("Sum is ${sum}")
}

//    Function with return type with parameter
fun mult(num3 : Int, num4: Int): Int{
    return num3 * num4
}

//    Function with return String
fun name(nam: String): String{
    return nam
}




