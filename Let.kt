package scopeFunctions

fun main() {

    /*let
    1- refers to context object using 'it'
    2- returns the lambda result

    check null pointer exception with let
     */

    val str:String?="Sumit"
    val jobProfile=str?.let {
        println(it.toUpperCase())
        "Android developer"
    }
    println(jobProfile)
}