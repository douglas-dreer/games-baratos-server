package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty


data class NSUID @JsonCreator constructor (
    @JsonProperty("value") var value: String? = null,
    @JsonProperty("matchLevel") var matchLevel: String? = null,
    @JsonProperty("fullyHighlighted") val fullyHighlighted: Boolean,
    @JsonProperty("matchedWords") var matchedWords: ArrayList<String> = arrayListOf()
)