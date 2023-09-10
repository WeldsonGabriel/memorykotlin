package com.exemplo.jogoMemoria

import javafx.scene.image.Image
class GameController {

        private val cards: MutableList<Card> = mutableListOf()

        fun loadPokemons() {
            // Aqui você iria carregar os pokemons através de uma API ou fonte local.
            // Como exemplo, estou apenas adicionando manualmente.
            cards.add(Card(1, "path/to/image1.png"))
            cards.add(Card(2, "path/to/image2.png"))
            // ... e assim por diante.
        }

        fun flipCard(card: Card) {
            // Implementar a lógica de virar um cartão.
        }

        fun getImageForCard(card: Card): Image {
            if (card.isFlipped) {
                return Image(card.imageUrl)
            } else {
                // Retorne a imagem padrão do cartão virado para baixo.
                return Image("path/to/default.png")
            }
        }

        // ... mais métodos conforme necessário.
    }

}