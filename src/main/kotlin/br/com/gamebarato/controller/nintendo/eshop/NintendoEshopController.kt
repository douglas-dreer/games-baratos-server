package br.com.gamebarato.controller.nintendo.eshop

import jakarta.websocket.server.PathParam
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nintendo/eshop")
class NintendoEshopController {

    @GetMapping("/jogo")
    fun listarTodosJogosPorRegiao(
        @PathParam("regiao") regiao: String
    ): ResponseEntity<String> {
        return ResponseEntity.ok("Isso é um teste")
    }

}
