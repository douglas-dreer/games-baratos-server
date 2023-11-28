package br.com.gamebarato.model.nintendo




data class Title (
    var value        : String?           = null,
    var matchLevel   : String?           = null,
    var matchedWords : ArrayList<String> = arrayListOf()

)