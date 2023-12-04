package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Fetch @JsonCreator constructor(
    @JsonProperty("query") val query: Int,
    @JsonProperty("total") val total: Int
)
