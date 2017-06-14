package eu.saramak.tut2

/**
 * Created by saramakm on 14/06/2017.
 */
typealias Money = Double
typealias Name = String
typealias Email = String

fun printNames(name: Name){

}

fun main(args: Array<String>) {
    printNames("Mariusz");
    printNames("Aga")
    val email = "mariopce@gmail.com"
    printNames(email) // no check that I print email.
}