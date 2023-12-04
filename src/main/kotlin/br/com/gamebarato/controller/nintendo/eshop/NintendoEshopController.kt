package br.com.gamebarato.controller.nintendo.eshop


import br.com.gamebarato.model.nintendo.GameResponse
import br.com.gamebarato.service.NintendoEshopService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/nintendo/eshop")
class NintendoEshopController @Autowired constructor(var service: NintendoEshopService) {

    @GetMapping("/jogo")
    fun listarTodosJogosPorRegiao(
        @RequestParam(name = "page", defaultValue = "0") page: Int,
        @RequestParam(name = "pageSize", defaultValue = "100") pageSize: Int,
        @RequestParam(name = "regiao", defaultValue = "BR") regiao: String
    ): ResponseEntity<GameResponse> {
        return ResponseEntity.ok(this.service.listar(page, pageSize, regiao))
    }

    @GetMapping("/jogo/{nuuid}")
    fun buscarJogoPorNuuid(@PathVariable("nuuid") nuuid: String): ResponseEntity<GameResponse> {
        val resultado = this.service.buscarPorUUID(nuuid)
        return ResponseEntity.ok(resultado)
    }

    @GetMapping("/jogo/promocao")
    fun buscarJogoEmPromocao(
        @RequestParam(name = "page", defaultValue = "0") page: Int,
        @RequestParam(name = "pageSize", defaultValue = "100") pageSize: Int
    ): ResponseEntity<GameResponse> {
        val resultado = this.service.buscarJogoEmPromocao(page, pageSize)
        return ResponseEntity.ok(resultado)
    }

}
