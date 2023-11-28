package br.com.gamebarato.model.nintendo




data class NSUID (
    var value: String? = null,
    var matchLevel: String? = null,
    val fullyHighlighted: Boolean,
    var matchedWords: ArrayList<String> = arrayListOf()
)