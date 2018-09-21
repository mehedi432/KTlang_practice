class House(type: String, price: Double, yearBuild: Int, owner: String){
    var type: String? = null
    var price: Double? = null
    var yearBuild: Int? = null
    var owner: String? = null

    init { /* This one Initializes all of our properties */
        this.type = type
        this.price = price
        this.yearBuild = yearBuild
        this.owner = owner
    }
}


fun main(args: Array<String>){
    var myHouse = House("3 Bed room", 23.0, 2019, "mehedi")
    println(myHouse.type)

    var anotherHouse = House("2 Bed Room", 19.0, 2022, "Babo")
    println(anotherHouse.type)
}