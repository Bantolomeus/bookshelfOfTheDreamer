package com.bantolomeus.bookshelfofthedreamer.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL
import javax.swing.text.html.HTMLDocument

@RestController
@RequestMapping(produces = [(MediaType.APPLICATION_JSON_VALUE)])
class PagesController {

    @GetMapping()
    fun showFrontPage(): HTMLDocument {
        return freemarkerEngine
    }
}
