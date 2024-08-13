fun main() {

    // Create a Map
    println("printing Map")
    map()

    //2. Create a Mutable Map:
    println("MutableMap")
    mutableMap()
    println()

    //1. Create a Set:
    println("Set")
    set()

    //    2. Create a Mutable Set:
    println("MutableSet")
    mutableSet()


    //3. Pair
    println("Pair")
    pair()

//    2. Working with Triples:
    println("Triple")
    triple()


//    1. Handling Duplications:
//    1.1. Declare a List of integers with the values [1, 2, 3, 2, 4, 5, 3, 6, 1].
    println("Handling Multiplication")
    val intList: List<Int> = listOf(1, 2, 3, 2, 4, 5, 3, 6, 1)
    intList.handlingDuplication()

//Remove Duplications Using Set:
    println("Removing Duplication")
    intList.removingDuplication()

//    3. Check for Duplications with Additional Elements:
    println("checking duplication")
    intList.checkDuplicationAddition()

}