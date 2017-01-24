package com.hendisantika.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinJdbcApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinJdbcApplication::class.java, *args)
}
