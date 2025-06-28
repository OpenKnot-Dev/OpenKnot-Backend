package com.kancth.openknot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class OpenKnotApplication

fun main(args: Array<String>) {
	runApplication<OpenKnotApplication>(*args)
}
