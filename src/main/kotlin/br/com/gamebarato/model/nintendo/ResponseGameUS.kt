package br.com.gamebarato.model.nintendo

data class ResponseGameUS(
    val hits: String,
    val nbHits: Int,
    val hitsPerPage: Int,
    val page: Int,
    val nbPages: Int,
    val processingTimeMS: String,
    val exhaustiveNbHits: Boolean,
    val exhaustiveTypo: Boolean,
    val query: String,
    val params: String,
    val renderingContent: RenderingContent? = null,
    val exhaustive: Exhaustive
)
