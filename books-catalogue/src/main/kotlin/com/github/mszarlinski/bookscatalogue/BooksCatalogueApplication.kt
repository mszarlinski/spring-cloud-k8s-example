package com.github.mszarlinski.bookscatalogue

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksCatalogueApplication

fun main(args: Array<String>) {
    runApplication<BooksCatalogueApplication>(*args)
}
