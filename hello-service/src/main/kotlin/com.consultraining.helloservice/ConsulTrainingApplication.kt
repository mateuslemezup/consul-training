package com.consultraining.helloservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(
	Property::class
)
class ConsulTrainingApplication

fun main(args: Array<String>) {
	runApplication<ConsulTrainingApplication>(*args)
}
