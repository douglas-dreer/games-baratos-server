package br.com.gamebarato.model.nintendo

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.net.URL
import java.util.*

@JsonIgnoreProperties(ignoreUnknown = true)
data class Hits @JsonCreator constructor(
    @JsonProperty("salePrice") val salePrice: Double = 0.0,
    @JsonProperty("howToShop") val howToShop: ArrayList<String> = arrayListOf(),
    @JsonProperty("priceRange") val priceRange: String? = null,
    @JsonProperty("slug") val slug: String,
    @JsonProperty("freeToStart") val freeToStart: Boolean,
    @JsonProperty("msrp") val msrp: Double,
    @JsonProperty("objectID") val objectID: UUID,
    @JsonProperty("genres") val genres: ArrayList<String> = arrayListOf(),
    @JsonProperty("_distinctSeqID") val _distinctSeqID: Int,
    @JsonProperty("description") val description: String,
    @JsonProperty("availability") val availability: ArrayList<String> = arrayListOf(),
    @JsonProperty("horizontalHeaderImage") val horizontalHeaderImage: URL,
    @JsonProperty("playerFilters") val playerFilters: ArrayList<String> = arrayListOf(),
    @JsonProperty("generalFilters") val generalFilters: ArrayList<String> = arrayListOf(),
    @JsonProperty("_highlightResult") val _highlightResult: HighlightResult?,
    @JsonProperty("featured") val featured: Boolean,
    @JsonProperty("franchises") val franchises: ArrayList<String> = arrayListOf(),
    @JsonProperty("lowPrice") val lowPrice: Double,
    @JsonProperty("title") val title: String,
    @JsonProperty("releaseDateDisplay") val releaseDateDisplay: String,
    @JsonProperty("publishers") val publishers: ArrayList<String> = arrayListOf(),
    @JsonProperty("nsuid") val nsuid: Long,
    @JsonProperty("developers") val developers: ArrayList<String> = arrayListOf(),
    @JsonProperty("esrbRating") val esrbRating: String,
    @JsonProperty("numOfPlayers") val numOfPlayers: String?,
    @JsonProperty("lastModified") val lastModified: String,
    @JsonProperty("platform") val platform: String,
    @JsonProperty("esrbDescriptors") val esrbDescriptors: ArrayList<String> = arrayListOf(),
    @JsonProperty("url") val url: String? = null


)
