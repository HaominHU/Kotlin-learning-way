fun main(args: Array<String>) {

    //immutable
    val imperials = listOf("Emperor", "Death Vader", "Boba Fett")

    // .sorted(), .last(), .contains()


    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma")
    var rebyyy = arrayListOf<Int>()
    // .size .add, .indexOf() .remove

    //immutable
    val rebelsVehiclesMap = mapOf("Key" to "Value")
    // map value to key

    println(rebelsVehiclesMap)
    println(rebelsVehiclesMap["Key"])
    println(rebelsVehiclesMap.get("Key"))
    println(rebelsVehiclesMap.getOrDefault("Other", "The value doesnt exist"))
    println(rebelsVehiclesMap.values)

    val rebelVehicles = hashMapOf("Key" to "Value")
    rebelVehicles["Key"] = "New Value"
    rebelVehicles.put("New Key", "Second Value")
    println(rebelVehicles)
    rebelVehicles.remove("Key")
    println(rebelVehicles)
}