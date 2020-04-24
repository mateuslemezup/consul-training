package com.consultraining.helloservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConsulTrainingApplication

fun main(args: Array<String>) {
	runApplication<ConsulTrainingApplication>(*args)
}
