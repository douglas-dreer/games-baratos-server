package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class GameResponse @JsonCreator constructor (
    @JsonProperty("hits") val hits: ArrayList<Hits>,
    @JsonProperty("nbHits") val nbHits: Int,
    @JsonProperty("hitsPerPage") val hitsPerPage: Int,
    @JsonProperty("page") val page: Int,
    @JsonProperty("nbPages") val nbPages: Int,
    @JsonProperty("processingTimeMS") val processingTimeMS: String,
    @JsonProperty("exhaustiveNbHits") val exhaustiveNbHits: Boolean,
    @JsonProperty("exhaustiveTypo") val exhaustiveTypo: Boolean,
    @JsonProperty("query") val query: String,
    @JsonProperty("params") val params: String,
    @JsonProperty("renderingContent") val renderingContent: RenderingContent? = null,
    @JsonProperty("exhaustive") val exhaustive: Exhaustive
)
