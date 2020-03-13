package com.bantolomeus.bookshelfofthedreamer.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL

@RestController
@RequestMapping("/books", produces = [(MediaType.APPLICATION_JSON_VALUE)])
class BookController {

    @GetMapping(path = ["{bookName}"])
    fun getBookWithUpdates(@PathVariable("bookName") bookName: String): String {
        return URL("https://www.googleapis.com/books/v1/volumes?q=intitle:${bookName}&num=200").readText()
    }
}
