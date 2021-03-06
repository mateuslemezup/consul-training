package com.consultraining.hellocallservice

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name = "consul-hello-service", fallback = HelloServiceFallback::class)
interface HelloServiceClient {
    @GetMapping("/value")
    fun getValue(): ValueResponse
}

@Component
class HelloServiceFallback : HelloServiceClient {
    override fun getValue(): ValueResponse {
        return ValueResponse("Hystrix Value")
    }
}


data class ValueResponse(val value: String)