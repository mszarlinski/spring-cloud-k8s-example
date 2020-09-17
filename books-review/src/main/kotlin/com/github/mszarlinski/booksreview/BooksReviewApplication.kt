package com.github.mszarlinski.booksreview

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BooksReviewApplication

fun main(args: Array<String>) {
    runApplication<BooksReviewApplication>(*args)
}
