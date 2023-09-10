package com.exemplo.jogoMemoria
class Card {
    data class Card(
        val pokemonId: Int,
        val imageUrl: String,
        var isFlipped: Boolean = false
    )

}