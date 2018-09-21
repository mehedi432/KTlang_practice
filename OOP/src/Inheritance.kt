open class Animal() {
    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

//    Implicit constructor
    constructor(name: String, color: String, numLegs: Int): this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs
    }

}

class Cow : Animal(){

}

fun main(args: Array<String>){
    var dog = Animal("Dog", "Brown", 4)
    println("A animal ${dog.name} which has color of ${dog.color} has only ${dog.numLegs} legs.")

    var cat = Animal("Cat", "Black", 4)
    println("A animal ${cat.name} which has color of ${cat.color} has only ${cat.numLegs} legs.")

    var cow = Cow()
}