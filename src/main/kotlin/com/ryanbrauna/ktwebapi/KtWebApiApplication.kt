package com.ryanbrauna.ktwebapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtWebApiApplication

fun main(args: Array<String>) {
	runApplication<KtWebApiApplication>(*args)
}
