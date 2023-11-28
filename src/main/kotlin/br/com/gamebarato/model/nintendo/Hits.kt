package br.com.gamebarato.model.nintendo

import java.net.URL
import java.time.LocalDateTime
import java.util.UUID

data class Hits(
    val salePrice: Double? = null,
    val howToShop: ArrayList<String> = arrayListOf(),
    val priceRange: String? = null,
    val slug: String,
    val freeToStart: Boolean,
    val msrp: Double,
    val objectID: UUID,
    val genres: ArrayList<String> = arrayListOf(),
    val _distinctSeqID: Int,
    val description: String,
    val availability: ArrayList<String> = arrayListOf(),
    val horizontalHeaderImage: URL,
    val playerFilters: ArrayList<String> = arrayListOf(),
    val generalFilters: ArrayList<String> = arrayListOf(),
    val _highlightResult: HighlightResult,
    val featured: Boolean,
    val franchises: ArrayList<String> = arrayListOf(),
    val lowPrice: Double,
    val title: String,
    val releaseDateDisplay: LocalDateTime,
    val publishers: ArrayList<String> = arrayListOf(),
    val nsuid: NSUID,
    val developers: ArrayList<String> = arrayListOf(),
    val esrbRating: String,
    val numOfPlayers: String,
    val lastModified: String,
    val platform: String,
    val esrbDescriptors: ArrayList<String> = arrayListOf(),
    val url: URL? = null


    )
