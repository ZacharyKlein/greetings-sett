package greetings.controllers

import greetings.services.GreetingService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.reactivex.Single

import javax.inject.Inject

@Controller("/greeting")
class GreetingController {

    @Inject
    GreetingService greetingService

    @Get("/{name}")
    Single<String> greeting(String name) {
        return greetingService.message(name)
    }

}