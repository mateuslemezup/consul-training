package com.consultraining.helloservice

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import java.lang.RuntimeException
import javax.annotation.PostConstruct

@RefreshScope
@ConfigurationProperties(prefix = "property")
class Property(var value: String = "") {

    @PostConstruct
    fun postConstruct() {
        if (this.value.isEmpty()) throw RuntimeException("Valor não encontrado")
    }

}