package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class ProcessingTimingsMS @JsonCreator constructor(
    @JsonProperty("fetch") val fetch: Fetch,
    @JsonProperty("total") val total: Int,
    @JsonProperty("getIdx") val getIdx: GetIdx
)
