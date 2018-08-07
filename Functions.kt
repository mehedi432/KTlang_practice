fun main(args: Array<String>) {
//    Ordinary function
    fun name(){
        println("Ordinary Function")
    }
    name()


//    Function with parameters
    fun anotherFun(nam: String){
        println("Hello Mr. $nam")
    }
    anotherFun("Mehedi")


//    Function with return
    fun calculator(num1: Int, num2: Int):Int{
        val ans = num1 + num2
        return ans
    }

    val calculator = calculator(1, 2)
    println("The answer is $calculator")

    fun calculate(number1: Int, number2: Int):Int{
        return number1 - number2
    }
    val calculate = calculate(2,1) // calculate = 1
    println("The Substation is $calculate")


//  Function return String
    fun nameFull(firstName: String, lastName:String):String{
        return "Your full name is $firstName $lastName "
    }
    val fullName = nameFull("Abdullah Al","Mehedi")
    println(fullName)


//    Taking Integer Input from the User
    fun takeInput(){
        println("Enter Value 1: ")
        val value1 = readLine()!!.toInt()
        println("Enter Value 2: ")
        val value2 = readLine()!!.toInt()

        val sum = value1 + value2
        print(sum)
    }
    takeInput()


//    Taking String Input from the User
    fun takeStringInput(){
        println("\nPlease Enter your First Name: ")
        val nam1 = readLine()
        println("Please Enter your Last Name: ")
        val num2 = readLine()

        println ("Your Full Name is $nam1 $num2")
    }
    takeStringInput()


//    Returning value and use it other code

    fun takeInt(num1 : Int, num2: Int):Int{
        return num1 + num2
    }

    print("The sumation is ${takeInt(10,20)}\n")

//    Default value
    fun anotherFun2(mood: String ="Angry"){
        print(mood)
    }
    anotherFun2()
    anotherFun2("\nStupid")
    
}
