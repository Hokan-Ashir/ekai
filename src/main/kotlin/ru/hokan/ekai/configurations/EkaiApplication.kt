package ru.hokan.ekai.configurations

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class EkaiApplication

fun main(args: Array<String>) {
    runApplication<EkaiApplication>(*args)
}
