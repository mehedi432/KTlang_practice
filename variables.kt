/*
** Variables Syntax in kotlin
* The process of declaring a variable in kotlin is pretty same as JavaScript and it also need not to
* declare the type of the variable for declaring a variable. Only the 'val' keyword is required for
* declaring the variable.

*/

/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 * 'var' is used for ordinary variable where there is also immutable variable
 * is also present which is like the constant variable and the syntax of 
 * writing constant variable is 'val'
 * 
 */

fun main(args: Array<String>){
	// In kotlin single quotation means character literals and double quotaion means String literals     
	// This name1 is a constant variable and we can not change the value of this name1      
    val name1 = "abdullah"  // Constant variable || Immutable
    val isPolite = false    // Constant variable || Immutable
    
    // This name2 is an ordinary variable and we can change the value of this name2
    var name2 = "mehedi"
    var isAwesome = true
    println("Is " + name1 + " awesome? The answer is: " + isPolite)
    println("Is " + name2 + " awesome? The answer is: " + isAwesome)
    
    
//     Data types in kotlin
//     --------------------
//     1.String
//     2.Int
//     3.Double -64bit 
//     4.Float - 32bit example: val floatNum = 123.321f
//     5.Boolean
//     6.Long - 64bit example: val longNum = 123.321L
//  
	var intNum = 1
    var intNum2 = 2
    println(intNum + intNum2)
    
//     Type conversion
//     ---------------
	var aDouble = intNum.toString()
    println(aDouble) // now aDouble is "1"
    
//     Type inference - kotlin is a kind of that and we need not to explicitly tell
//     the type of the variables but kotlin also provide the option for type declaration
   	var hero: String // Initialization of a variable without value
    hero = "Mehedi Abdullah"
    println("The name of the Hero is: " + hero)
}

