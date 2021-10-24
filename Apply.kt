package scopeFunctions

class Person2{
    var name:String=""
    var age:Int=0
}

fun main() {

    /*apply:
    1-refers to context object using this
    2-the return value is 'context object'
     */

    val person2=Person().apply {
        name="Sumit"
        age=21

    }
    with(person2){
        println(name)
        println(age)
    }
}