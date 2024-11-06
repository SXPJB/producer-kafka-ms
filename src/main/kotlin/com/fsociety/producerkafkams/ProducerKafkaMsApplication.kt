package com.fsociety.producerkafkams

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProducerKafkaMsApplication

fun main(args: Array<String>) {
    runApplication<ProducerKafkaMsApplication>(*args)
}
