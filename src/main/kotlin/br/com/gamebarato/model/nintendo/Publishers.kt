package br.com.gamebarato.model.nintendo

data class Publishers(
    val value: String,
    val matchLevel: String,
    val matchLedWords: ArrayList<String> = arrayListOf()
)
