package eu.saramak.tut2

interface DescribeTest {
    infix fun LocalFun.given(message: String) {
        println(message)
    }
    infix fun LocalFun.whenn(message: String) {
        println(message)
    }
    infix fun LocalFun.then(message: String) {
        println(message)
    }
}