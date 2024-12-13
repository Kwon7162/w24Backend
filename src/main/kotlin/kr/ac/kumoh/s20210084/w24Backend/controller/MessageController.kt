package kr.ac.kumoh.s20210084.w24Backend.controller

import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/message")
class MessageController {
    @GetMapping
    // TODO: React 주소 변경할것
    @CrossOrigin(origins = ["htttp://localhost:3000"])
    fun getMessage() = mapOf("status" to "success")
}