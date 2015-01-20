package app

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("rest")
class JaxrsActivator extends Application {

    public JaxrsActivator() {
        super()
        println "init ***********"
    }
}
