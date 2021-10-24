package scopeFunctions

fun main() {
    /*also
    1- refers to context object using 'it'
    2- returns the context object

    mainly used to perform the extra operations
     */

    val numbersList= mutableListOf<Int>(1,2,3)

    /*without using "also"

    println(numbersList)
    numbersList.add(4)
    println(numbersList)
    numbersList.remove(2)
    println(numbersList)

     */

    val duplicateList=numbersList.also {
        println("Using also 'scope' function")
        println(it)
        it.add(4)
        println(it)
        it.remove(2)
    }

    //numbersList and duplicateList both these variables are pointing to the same object
    println("The return value of also is $duplicateList")
    println(numbersList)
}