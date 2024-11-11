package com.fsociety.producerkafkams.app.controller

import com.fsociety.producerkafkams.common.response.ResponseBody
import com.fsociety.producerkafkams.domain.entity.TodoUser
import com.fsociety.producerkafkams.domain.repository.TodoUserRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/healthcheck")
class HealthCheckController(
    val repostory: TodoUserRepository
) {
    @GetMapping
    fun healthcheck(): ResponseEntity<ResponseBody<Map<String, String>>> {
        return ResponseEntity.ok(ResponseBody(data = mapOf("status" to "OK")))
    }

    @GetMapping("/test")
    fun test(): MutableList<TodoUser> = repostory.findAll()
}