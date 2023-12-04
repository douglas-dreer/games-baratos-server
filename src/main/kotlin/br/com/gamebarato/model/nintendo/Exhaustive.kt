package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Exhaustive @JsonCreator constructor(
    @JsonProperty("salePrice") val salePrice: Boolean,
    @JsonProperty("howToShop") val howToShop: Boolean
) {
    constructor() : this(
        false,
        false
    )
}


