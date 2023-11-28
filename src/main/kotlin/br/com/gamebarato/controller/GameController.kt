package br.com.gamebarato.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/game")
class GameController {
    @GetMapping
    fun listar(): ResponseEntity<String> {
        return ResponseEntity.ok("Sucesso")
    }
}