package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class HighlightResult @JsonCreator constructor(
    @JsonProperty("title") val title: Title?,
    @JsonProperty("nsuid") val nsuid: NSUID?,
    @JsonProperty("publishers") val publishers: ArrayList<Publishers>?
)
