package eu.saramak.tut1

/**
 * Created by saramakm on 31/05/2017.
 */
class Customer2ndCons(var name: String, val sex:String = "M") {
    var id =0
    init {
        id++
        name = name.toUpperCase()
    }
    constructor(email: String):this("Mariusz", "M"){
        name = email.substring(0, 5);
    }

}
