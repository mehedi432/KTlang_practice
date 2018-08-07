/*
* Using Loops in KotLang
* */
fun main(args: Array<String>) {
    val family = arrayListOf("Masum", "Babo", "Hiramon", "Abir")
    val familyNumbers = hashMapOf("Masum" to "01716871862", "Babo" to "019111" +
            "32339", "Amma" to "01827573636")
//    println(familyNumbers)

//    Printing the elements of Collection to the console
//    arrayListOf(<Mutable>)
    for (name in family){
        println("Name: $name")
    }
    /*
    *   Output
    * ----------
    * Name: Masum
    * Name: Babo
    * Name: Hiramon
    * Name: Abir
    *
    * */
    familyNumbers.put("Abba", "01711112525")
    for ((key, value) in familyNumbers){
        println("$key\'s mobile number is : $value")
    }
    /*   Output
    * ----------
    * Babo's mobile number is : 01911132339
    * Masum's mobile number is : 01716871862
    * Amma's mobile number is : 01827573636
    * Abba's mobile number is : 01711112525
    *
    * */

    var x = 10
    while (x <= 100){
        println(x)
        x+=1
    }

}
