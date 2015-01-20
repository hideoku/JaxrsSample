package app

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

@Path("hello")
class HelloResource {

    @GET
    String say(@QueryParam("name") String name) {
        "Hello, ${name}!"
    }
}
