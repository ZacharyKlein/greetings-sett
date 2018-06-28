package greetings

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.Client
import io.reactivex.Single

@Client("/greeting")
interface GreetingClient {

    @Get("/{name}")
    Single<String> greeting(String name)
}
