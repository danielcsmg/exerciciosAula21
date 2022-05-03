package exercicios.exercicio2

class Passarinho(nome: String, raca: String, responsavel: String): Animal(nome, raca, responsavel) {
    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun movimentar() {
        println("Nadando")
    }

    override fun dormir() {
        println("Dormindo de olho aberto")
    }
}