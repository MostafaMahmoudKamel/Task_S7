fun map() {
    //1.1. Declare an immutable Map of strings to integers with the values ("apple" to 3, "banana" to 2, "cherry" to 5).
    val immutableMap: Map<String, Int> = mapOf("apple" to 3, "banana" to 2, "cherry" to 5)

    //1.2. Use a loop to iterate through the map and print each key-value pair using entries.
    immutableMap.printMap()

    //1.3. Use the getValue function to retrieve the value for the key "banana" and print it.
    println("value of banana is = ${immutableMap["banana"]}\n")

    // 1.4. Check if the map contains the key "apple" using containsKey and print the result.
    println("contain key apple = ${immutableMap.containsKey("apple")}\n")

}

fun Map<String,Int>.printMap(){
    for ((key, value) in this.entries) {
        println("key is = $key , Value is = $value")
    }
    println()
}


fun mutableMap() {
    //2.1. Declare a MutableMap of strings to doubles with the values ("one" to 1.1, "two" to 2.2, "three" to 3.3).
    val mutableMap: MutableMap<String, Double> = mutableMapOf("one" to 1.1, "two" to 2.2, "three" to 3.3)

    //2.2. Add a new key-value pair "four" to 4.4 to the mutable map.
    mutableMap["four"] = 4.4

//    2.3. Remove the key "two" from the mutable map.
    mutableMap.remove("two")

//    2.4. Use a loop to iterate through the mutable map and print each key-value pair using forEach.
    mutableMap.printMutableMap()

//    2.5. Sort the mutable map by key in ascending order and print the sorted map.
    val mutableMapSorted = mutableMap.toSortedMap()
    println(mutableMapSorted)
}

fun MutableMap<String,Double>.printMutableMap(){
    for ((key, value) in this) {
        println("key is = $key , value is = $value")
    }
    println()
}


fun set() {
    //1.1. Declare an immutable Set of integers with the values [1, 2, 3, 4, 5].
    val immutableSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    //1.2. Use a loop to iterate through the set and print each value.
    immutableSet.printSet()

    //1.3. Check if the set contains the value 3 using the contains operator and print the result
    println("contain 3 = ${immutableSet.contains(3)}\n")
}

fun Set<Int>.printSet(){
    for (value in this) {
        println("set value is $value")
    }
    println()
}


fun mutableSet() {
    //    2.1. Declare a MutableSet of strings with the values ["apple", "banana", "cherry"].
    val mutableSet: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")

    //2.2. Add the value "date" to the mutable set.
    mutableSet.add("date")

    //2.3. Remove the value "banana" from the mutable set.
    mutableSet.remove("banana")

    //2.4. Use a loop to iterate through the mutable set and print each value using forEach
    mutableSet.forEach { println("mutable set is $it") }
    println()

    //2.5. Convert the mutable set to a sorted list and print the sorted list.
    mutableSet.sortSet()

}

fun MutableSet<String>.sortSet(){
    val mutableSetToSortedList = this.toList().sorted()
    println("mutableSetToSortedList = $mutableSetToSortedList\n")
}


fun pair() {
    //    1.1. Declare a Pair of a string and an integer with the values ("apple", 5).
    val pair: Pair<String, Int> = "apple" to 5

//    1.2. Access the first and second elements of the pair and print them.
    println("first = ${pair.first}, second = ${pair.second}\n")

//    1.3. Create a list of pairs with the values [("one", 1), ("two", 2),("three", 3)].
    val pairList: List<Pair<String, Int>> = listOf("one" to 1, "two" to 2, "three" to 3)

//    1.4. Use a loop to iterate through the list of pairs and print each pair.
    pairList.printPair()

}

fun List<Pair<String, Int>>.printPair(){
    for (pair in this) {
        println(pair)
    }
    println()
}


fun triple() {
    //    2.1. Declare a Triple of a string, an integer, and a double with the-values ("apple", 5, 1.1).
    val triple: Triple<String, Int, Double> = Triple("apple", 5, 1.1)

//    2.2. Access the first, second, and third elements of the triple and print them.
    println("first = ${triple.first} ,second = ${triple.second} , third = ${triple.third}\n")

//    2.3. Create a list of triples with the values [("one", 1, 1.1), ("two", 2,2.2), ("three", 3, 3.3)].
    val tripleList: List<Triple<String, Int, Double>> = listOf(
        Triple("one", 1, 1.1),
        Triple("two", 2, 2.2),
        Triple("three", 3, 3.3)
    )

//    2.4. Use a loop to iterate through the list of triples and print each triple.
    for (triple in tripleList) {
        println("triple is = $triple")
    }
    println()
}


fun List<Int>.handlingDuplication() {
    //    1.2. Create a MutableList to store duplicated elements.
    val mIntList = this.toMutableList()

//   1.3. Use a loop to iterate through the list and add any element that appears more than once to the MutableList of duplicates.
    val duplicated = mIntList.getDuplicated()

    //  1.4. Print the MutableList of duplicated elements.
    println("Duplicate elements: $duplicated")
}

//helperMethod to print duplicated
private fun MutableList<Int>.getDuplicated(): MutableList<Int> {
    val duplicated = mutableListOf<Int>()
    val visited = mutableListOf<Int>()

    for (element in this) {
        if (visited.contains(element)) {
            if (!duplicated.contains(element)) {
                duplicated.add(element)
            }
        } else {
            visited.add(element)
        }
    }

    return duplicated

}

fun List<Int>.removingDuplication() {
//    2.1. Convert the original list to a Set to remove all duplications.
    val set: Set<Int> = this.toSet()

//    2.2. Convert the Set back to a list.
    val setToList = set.toList()

//    2.3. Print the list after removing duplications.
    println(setToList)
    println()
}

fun List<Int>.checkDuplicationAddition(){
    //    3.1. Add additional elements [2, 7, 8, 3] to the original list.

    val additionElement = this+listOf(2, 7, 8, 3)
//    this.addAll(additionElement)

//    3.2. Convert the updated list to a Set to remove any duplication.
    val newSet = this.toSet()

//    3.3. Print the list after removing the new duplications.
    println("element after removing duplications $newSet")
}