/*
* Collection or Array
* Kotlin don't have it's own collection but it is same as java
* but it extends the functionality of a Collection or Array
* Arrays - listOf(<Immutable>), arrayListOf(<Mutable>)
* Maps - mapOf(<Immutable>), hashMapOf(<Mutable>)
* */

fun main(args: Array<String>) {

//    Immutable List - can't change
//    -----------------------------
    val friends = listOf("Emon", "Nazmul", "Jony", "Sathy", "Suchi")
    println("Sorted list of friends: ${friends.sorted()}")
    println("The index start at 0 is: ${friends[3]}")
    println("Cotain's Mishel : ${friends.contains("Mishel")}")
    println("The size or length of friends list is: $friends.size")

//    Mutable List - can change
//    --------------------------
    val family = arrayListOf("Babo", "Shuvo", "Masum", "Hiramon")
    println("The size or length of the family is: ${family.size}")
    println("New added family member is: ${family.add("Shamim")}")
    println("The last Added element is : ${family.last()}")
    println("Add family in specific Index : ${family.add(0, "Shahjahan")}")
    println("Added family in Index 0 is : ${family[0]}")
    println("Knowing Index of an Element: ${family.indexOf("Babo")}")
    println("Removing Element from an array: ${family.remove("Shamim")}")
    println("After removing the Array or List is: $family")
    println("After removing the Array or List is: ${family.removeAt(0)}")
    println("After removing the 0 index we get: $family")

//    Maps - Unordered List - This is immutable which means we can not add or
//    values or removes value from mapOf() collections.
//    -----------------------------------------------------------------------
//    Maps are collection of key,value pairs. Example - Phonebook
//    In the buddies collection Rasel is key and 01911179837 is value

    val buddies = mapOf("Rasel" to "01911179837", "Jewel" to "01911931556")
    println("The map collection access. Number of Rasel: ${buddies["Rasel"]}")
    println("The get method for getting Jewel is : ${buddies.get("Jewel")}")
    println("Getting text via default value: ${buddies.getOrDefault("Jewel", "019119315566")}")
    println("The way of displaying values: ${buddies.values}")

//  Mutable Map - hashMapOf() - we can add value and remove value to it.
//  --------------------------------------------------------------------------

    val familyMember = hashMapOf("rasel" to "01911179837", "jewel" to "01911931556")
    familyMember["rasel"] = "01611179837"
    println("Mutate the collection rasel to : ${familyMember["rasel"]}")
    familyMember.put("Aminul", "01716285337")
    print("Adding a new Hash Map :$familyMember\n")
    familyMember.remove("jewel")
    println(familyMember)
    println("The way of clearing the collection : ${familyMember.clear()}")
    println("The process of knowing Empty or not : ${familyMember.isEmpty()}")

}
