package scopeFunctions

class Person{
    var name:String="Sumit"
    var age:Int=21
}

fun main() {

    /* with
    refers to context object using 'this'
    return value is lambda result
    * */
    val person=Person()

    with(person){
        println(this.name)
        println(age)
    }

    //now to return something
    val jobProfile=with(person){
        println(this.name)
        println(age)
        "Android developer"
    }
    println(jobProfile)

}