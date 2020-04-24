package com.consultraining.hellocallservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloCallController(val helloServiceClient: HelloServiceClient) {
    @GetMapping
    fun hello(): HelloResponse {
        val valueResponse = helloServiceClient.getValue()

        return HelloResponse(valueResponse.value)
    }
}

data class HelloResponse(val hello: String)