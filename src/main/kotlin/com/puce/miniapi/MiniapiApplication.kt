package com.puce.miniapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MiniapiApplication

fun main(args: Array<String>) {
	runApplication<MiniapiApplication>(*args)
}
