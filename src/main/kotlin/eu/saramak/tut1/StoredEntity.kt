package eu.saramak.tut1

/**
 * Created by saramakm on 02/06/2017.
 */
abstract class StoredEntity{
    val isActive = true;
    abstract fun store();
    fun status(): String {
        return isActive.toString()
    }
}

class Employee : StoredEntity() {
    override fun store() {

    }

}