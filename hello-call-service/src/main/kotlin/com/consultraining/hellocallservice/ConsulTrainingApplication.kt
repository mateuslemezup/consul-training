package com.consultraining.hellocallservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.hystrix.EnableHystrix
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@EnableHystrix
class ConsulTrainingApplication

fun main(args: Array<String>) {
	runApplication<ConsulTrainingApplication>(*args)
}
