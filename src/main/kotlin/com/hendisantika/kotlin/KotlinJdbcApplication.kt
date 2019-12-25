package com.hendisantika.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinJdbcApplication

fun main(args: Array<String>) {
    runApplication<KotlinJdbcApplication>(*args)
}
