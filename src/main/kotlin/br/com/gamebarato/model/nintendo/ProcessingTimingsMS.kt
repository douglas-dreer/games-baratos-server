package br.com.gamebarato.model.nintendo

data class ProcessingTimingsMS(
    val fetch: Fetch,
    val total: Int,
    val getIdx: GetIdx
)
