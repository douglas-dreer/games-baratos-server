package br.com.gamebarato.gamebarato

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GameBaratoServiceApplication

fun main(args: Array<String>) {
    runApplication<GameBaratoServiceApplication>(*args)
}
