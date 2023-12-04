package br.com.gamebarato.client

import br.com.gamebarato.model.nintendo.GameRequest
import br.com.gamebarato.model.nintendo.GameResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface NintendoEshopRetrofitClient {
    @POST("1/indexes/ncom_game_pt_br/query")
    fun obterJogoPorNuuid(@Body params: GameRequest): Call<GameResponse>

    @GET("1/indexes/ncom_game_pt_br")
    fun obterJogosBrasil(
        @Query("page") page: Int,
        @Query("hitsPerPage") hitsPerPage: Int
    ): Call<GameResponse>


}
