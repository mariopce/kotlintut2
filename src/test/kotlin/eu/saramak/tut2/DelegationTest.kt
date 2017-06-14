package eu.saramak.tut2

/**
 * Created by saramakm on 14/06/2017.
 */

class LoginPresenter(loginUseCase : LoginUseCase, log : Logger) : LoginUseCase by loginUseCase, Logger by log {

    fun loginByEmail(email: String, password: String){
        if (email.length > 10)
        login(email, password)
        log()
    }

}

interface LoginUseCase {
    fun login(email: String, password: String);
}
class AndroidLoginUseCase : LoginUseCase{
    override fun login(email: String, password: String) {
        println("login " + email)
    }
}

interface Logger {
    fun log() {
        println("log")
    }
}
class MyLogger : Logger

fun main(args: Array<String>) {
    val loginPresenter = LoginPresenter(AndroidLoginUseCase(), MyLogger())
    loginPresenter.loginByEmail("mariopce@gmail.com", "xxx")
}
class DelegationTest {

}