package eu.saramak.tut2

import org.junit.Test
import java.lang.Boolean.TRUE
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Created by saramakm on 14/06/2017.
 */
class User {
    var email : String by EmailPropWithValidation
    var age: Int by Delegates.vetoable(18, {property, oldValue, newValue -> newValue > 1 && newValue < 100})
    var name : String by Delegates.observable("", {property, oldValue, newValue -> println("$oldValue -> $newValue") })
}

object EmailPropWithValidation : ReadWriteProperty<User, String> {
    var correctEmail = "test@test.pl"
    override fun setValue(thisRef: User, property: KProperty<*>, value: String) {
        if (value.contains("@")){
            correctEmail = value
        }
    }

    override fun getValue(thisRef: User, property: KProperty<*>): String {
        return correctEmail
    }

}

val User.hasEmail : Boolean
    get() = email != ""


class DelegateProperties{
    @Test
    fun `Should set email`(){
        val user = User()
        user.email = "mariopce@gmail.com"
        user.name = "Mario"
        user.age = 0;
        user.name = "Mariusz"
        assert(user.email=="mariopce@gmail.com")
        assert(user.age==18)
        assert(user.hasEmail)
    }
}