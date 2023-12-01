package br.com.gamebarato.service

import br.com.gamebarato.client.NintendoEshopRetrofitClient
import br.com.gamebarato.model.nintendo.GameRequest
import br.com.gamebarato.model.nintendo.GameResponse
import lombok.extern.log4j.Log4j2
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.Response
import java.io.IOException
import kotlin.math.log

@Service
@Log4j2
class NintendoEshopService @Autowired constructor(
    private val client: NintendoEshopRetrofitClient
) {
    fun listar(): GameResponse? {
        val call: Call<GameResponse> = client.obterJogosBrasil()
        var resultado: GameResponse? = null

        try {
            val response: Response<GameResponse> = call.execute()
            if (!response.isSuccessful) {
                throw Exception("Houve um erro ao executar")
            }
            resultado = response.body()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return resultado
    }

    fun buscarPorUUID(uuid: String): GameResponse? {
        val request = GameRequest(200, 0, uuid)
        val call: Call<GameResponse> = client.obterJogoPorNuuid(request)

        try {
            val response: Response<GameResponse> = call.execute()

            if (!response.isSuccessful) {
                throw Exception("Erro")
            }

            return response.body()
            /*
            return if (response.isSuccessful) {
                response.body()
            } else {
                println("Erro na requisição: ${response.errorBody()?.string()}")
                null
            }
             */
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return null
    }
}
