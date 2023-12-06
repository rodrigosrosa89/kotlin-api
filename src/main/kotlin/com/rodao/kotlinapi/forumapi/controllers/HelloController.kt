package com.rodao.kotlinapi.forumapi.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class HelloController {

    @GetMapping("/forum-api/hello")
    fun hello(): String {
        return "Hello world sucesso!"
    }
}