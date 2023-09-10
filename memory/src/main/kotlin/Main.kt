package com.exemplo.jogoMemoria

import javafx.application.Application
import javafx.stage.Stage
fun main() {

    class Main : Application() {

        private val gameController = GameController()

        override fun start(primaryStage: Stage) {
            gameController.loadPokemons()

            // Criar uma GUI básica para o jogo da memória usando JavaFX.
            // Isso inclui criar um GridPane para os cartões, tratando eventos de clique, etc.
        }
    }

    fun main(args: Array<String>) {
        Application.launch(Main::class.java, *args)
    }
}