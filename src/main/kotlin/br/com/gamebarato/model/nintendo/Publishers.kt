package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class Publishers @JsonCreator constructor(
    @JsonProperty("value") val value: String,
    @JsonProperty("matchLevel") val matchLevel: String,
    @JsonProperty("matchLedWords") val matchedWords: ArrayList<String>? = arrayListOf()
)
