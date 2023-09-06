package io.gvespucci.kotestpoc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotestPocApplication

fun main(args: Array<String>) {
	runApplication<KotestPocApplication>(*args)
}
