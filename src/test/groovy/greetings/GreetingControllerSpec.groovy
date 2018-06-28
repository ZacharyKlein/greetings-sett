package greetings

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.reactivex.Single
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification

class GreetingControllerSpec extends Specification {

    @Shared @AutoCleanup EmbeddedServer embeddedServer = ApplicationContext.run(EmbeddedServer)

    void "test greeting"() {
        given:
        GreetingClient client = embeddedServer.applicationContext.getBean(GreetingClient)


        expect:
        client.greeting("Beth").blockingGet() == "Hello, Beth"
    }
}
