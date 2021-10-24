package scopeFunctions

class Person3{
    var name:String="Sumit"
    var age:Int=21
}

fun main() {
    /*run
    1- refers to context object using 'this'
    2- returns the lambda result

    run= with+ let
    with jo hota h wo nullable context pr kaam ni krega but run se kr skte h
     */
    //val person:Person3?=null
    val person:Person3?=Person3()
    person?.run{
        println(this.name)
        println(age)
    }

    //now to return something
    val jobProfile=person?.run{
        println(this.name)
        println(age)
        "Android developer"
    }
    println(jobProfile)

}