package com.github.mszarlinski.booksgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksGatewayApplication

fun main(args: Array<String>) {
    runApplication<BooksGatewayApplication>(*args)
}
