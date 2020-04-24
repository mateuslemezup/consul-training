package com.consultraining.helloservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HelloController {

    @GetMapping("/value")
    fun getRandomValue(): ValueResponse {
        return ValueResponse()
    }

}

object Value {
    val random = UUID.randomUUID().toString()
}

data class ValueResponse(val value: String = Value.random)