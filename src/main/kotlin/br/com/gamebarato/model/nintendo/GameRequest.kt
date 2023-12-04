package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class GameRequest @JsonCreator constructor(
    @JsonProperty("hitsPerPage") var hitsPerPage: Int,
    @JsonProperty("page") var page: Int,
    @JsonProperty("query") var query: String
) {
    fun toURL(): String {
        return "{ params: 'hitsPerPage'=$hitsPerPage&'page'=$page&'query'=&'$query' }"
    }
}