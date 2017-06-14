package eu.saramak.tut2

/**
 * Created by saramakm on 13/06/2017.
 */
class InnerNestedClass(val user:String)
{
    inner class InnerClass {
        fun validate(){
           if (user==""){
               throw IllegalArgumentException("")
           }
        }
    }

}

fun main(args: Array<String>) {
    InnerNestedClass("user").InnerClass().validate();
}