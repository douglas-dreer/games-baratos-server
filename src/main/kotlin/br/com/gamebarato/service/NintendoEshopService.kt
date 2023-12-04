package br.com.gamebarato.service

import br.com.gamebarato.client.NintendoEshopRetrofitClient
import br.com.gamebarato.model.nintendo.GameRequest
import br.com.gamebarato.model.nintendo.GameResponse
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NintendoEshopService @Autowired constructor(
    private val client: NintendoEshopRetrofitClient,
    private val log: Logger = LogManager.getLogger(NintendoEshopService::class.java)
) {

    fun listar(page: Int, pageSize: Int, regiao: String): GameResponse? {
        return runCatching {
            client.obterJogosBrasil(page, pageSize).execute()
                .takeIf { it.isSuccessful }
                ?.body()
        }.onFailure {
            log.error("Erro ao obter lista de jogos", it)
        }.getOrNull()
    }

    fun buscarPorUUID(uuid: String): GameResponse? {
        val request = GameRequest(1, 0, uuid)
        return runCatching {
            client.obterJogoPorNuuid(request).execute()
                .takeIf { it.isSuccessful }
                ?.body()
        }.onFailure {
            log.error("Erro ao obter jogo por UUID", it)
        }.getOrNull()
    }

    fun buscarJogoEmPromocao(page: Int, pageSize: Int): GameResponse? {
        return listar(page, pageSize, "BR")?.takeIf { it.hits?.isNotEmpty() == true }
            ?.apply { hits = ArrayList(hits!!.filter { it.salePrice != 0.0 }) }
    }
}
