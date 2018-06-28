package greetings.services

import groovy.util.logging.Slf4j
import io.reactivex.Single
import javax.inject.Singleton

@Slf4j
@Singleton
class GreetingService {

    Single<String> message(String name) {
        log.info "Message for ${name}"
        Single.just("Hello, ${name}".toString())
    }
}