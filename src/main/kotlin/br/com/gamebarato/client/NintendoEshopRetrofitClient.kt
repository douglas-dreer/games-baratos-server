package br.com.gamebarato.client

import br.com.gamebarato.model.nintendo.GameRequest
import br.com.gamebarato.model.nintendo.GameResponse
import org.springframework.cache.annotation.Cacheable
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface NintendoEshopRetrofitClient {
    @POST("1/indexes/ncom_game_pt_br/query")
    fun obterJogoPorNuuid(@Body params: GameRequest): Call<GameResponse>

    @GET("1/indexes/ncom_game_pt_br")
    fun obterJogosBrasil(): Call<GameResponse>
}
