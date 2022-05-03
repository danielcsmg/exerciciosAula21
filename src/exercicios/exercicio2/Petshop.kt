package exercicios.exercicio2

fun main() {
    val cachorro: Animal = Cachorro("Oswaldo", "Pittbull", "João")
    cachorro.comer()
    cachorro.movimentar()
    cachorro.dormir()

    val gato: Gato = Gato("Robson", "Siamês", "Maria")
    gato.comer()
    gato.movimentar()
    gato.dormir()

    val passarinho: Passarinho = Passarinho("Henzo", "Calopsita", "Diana")
    passarinho.comer()
    passarinho.movimentar()
    passarinho.dormir()
}