package eu.saramak.tut2

/**
 * Created by saramakm on 13/06/2017.
 */

class Request(val method: String, val query: String, val contentType: String)
class Response(var contents: String, var status: Status){
    fun status(status: Status.()->Unit){

    }
}

class Status(var code: Int, var description: String)
class RouteHandler(val request: Request, val response: Response){
    fun next(){

    }
}
fun response(response: Response.() -> Unit){

}
fun routeHandler(path: String, f : RouteHandler.() -> Unit) : RouteHandler.() -> Unit = f
fun main(args: Array<String>) {
    routeHandler("/index.html") {
        if (request.query != ""){

        }
        response {
            contents = ""
            status {
                code = 404
                description = "not found"
            }
        }
    }
}
class LambdaExtenctions{

}