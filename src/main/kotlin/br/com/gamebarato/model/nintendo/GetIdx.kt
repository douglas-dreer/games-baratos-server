package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class GetIdx @JsonCreator constructor(
    @JsonProperty("total") val total: Int,
    @JsonProperty("unload") val unload: Int
)
