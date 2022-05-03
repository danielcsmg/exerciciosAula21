package exercicios.exercicio2

class Gato(nome: String, raca: String, responsavel: String): Animal(nome, raca, responsavel) {
    override fun comer() {
        println("Comendo whiskas sachê")
    }

    override fun movimentar() {
        println("Andando e saltando em 4 patas!")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}