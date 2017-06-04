package eu.saramak.tut1

import org.junit.Test

/**
 * Created by saramakm on 04/06/2017.
 */
class DeconstructingValues {

    fun cityPopulation() : Pair<String, Long>{
        return Pair("Warszawa", 2_000_000)
    }
    @Test()
    fun `Working with pairs`() {
        val warsawPait = cityPopulation();
        assert(warsawPait.first == "Warszawa")
        assert(warsawPait.second == 2_000_000L)

    }
    @Test()
    fun `Working with deconstructuin pairs`() {
        val (capital, population) = cityPopulation();
        assert(capital == "Warszawa")
        assert(population == 2_000_000L)
    }
    @Test()
    fun `Working with deconstructuin pairs from class`() {
        val (id, name, email) = CustomerKotlin(1, "Mariusz", "mariopce@gmail.com")
        assert(email == "mariopce@gmail.com")
    }


    @Test()
    fun `Working with deconstructuin pairs in loop`() {
        val listOfCountriesAndCapitals = listOf<Pair<String, String>>(Pair("Poland", "Warsaw"), "France" to "Paris")
        for ((country, capital) in listOfCountriesAndCapitals){
            println("$country : $capital")
        }
        assert(listOfCountriesAndCapitals[1].second == "Paris", {listOfCountriesAndCapitals})
    }


}