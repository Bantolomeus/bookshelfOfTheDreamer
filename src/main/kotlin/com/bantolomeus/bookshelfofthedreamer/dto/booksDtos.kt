package com.bantolomeus.bookshelfofthedreamer.dto

data class BookDTO(
        var name: String = "",
        var author: String = "",
        var pagesTotal: Long = 0,
        var currentPage: Long = 0,
        var dateStarted: String = "",
        var readTime: Long = 0
)

data class BookGetDTO(
        val book: BookDTO = BookDTO()
)
