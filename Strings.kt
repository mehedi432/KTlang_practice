/**
 * We declare a package-level 'function main' which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 * 
 */

fun main(args: Array<String>){
//     Escape characters in kotlin
//     ---------------------------
//     \n -> for new line
//     \t -> for making tabs between two character
//     \" -> for giving quation mark
//     \' -> for giving single quation mark
//     \$ -> for $ sign
//     \\ -> for backslash
//     \r -> carries return
//     
    val str = "My name is Abdullah Al Mehedi nickname: "
    val str2 ="babo"
    println(str + str2)
    
//     Raw string
//     ----------
//     trimMargin() will make it beautiful and that needs a symbol like(|, >, <) in every
//     line and we have to specify in the trimMargin("<symbol_used>") function.
	val rawCrawl = """ A raw string..
    			   It is upgly. It is really
                   ugly to see that kind of String
                   in programming kotlang.""".trimMargin()
    println(rawCrawl)

    val rawCrawl_1 = """>A raw string..
    			   >It is upgly. It is really
                   >ugly to see that kind of String
                   >in programming kotlang.""".trimMargin(">")
    println(rawCrawl_1)
    
//     Beautiful for loop
//     ------------------
//     for(char in str){
//         println(char)
//     }

//     Checking string with one another
//     --------------------------------
    var check_string = str.contentEquals("Abdullah Al Mehedi")
	println(check_string) // result is 'false'
    
//     Checking characters with given string
//     ------------------------------------- 
	val contains = str.contains("bdullah", true)
	println(contains) // result is 'true'    
    
    val upper = str.toUpperCase()
    val lower = str.toLowerCase()
    println(upper)
    println(lower)
    
//     Number conversion
//     -----------------
    val num = 89
    val stringNum = num.toString()
    print(stringNum + "\n")
    
//     Sub Sequence
//     ------------
	val subSqnce = str.subSequence(4,13)
    println(subSqnce)
    
//     String Templates - is awesome
//     -----------------------------
//     We can use it with '$<variable_name>' sign which represent the value of the variable
//     we can also add functions in the string template by using ${<functions>} 
    val masum = "A good boy with a wide money"
    val modin = "A good heart with passion and style"
    val nayeem = "Apache RTR"
    
    println("Abdullah Al Mehedi is $masum and $modin also have $nayeem ")
    println("$nayeem  is ${100+60} cc  with ${masum.length} character\'s")   
    
}
