package exercicios.exercicio3

fun main() {
    val carro1: Carro = Renault("Sandero", 2022, 50000.0, "Prata", 4)
    carro1.darPartida()
    carro1.acelerar()
    carro1.frear()
    carro1.frear()
    println("----###----###----")
    println()
    val carro2: Carro = Fiat("Uno", 2013, 14000.0, "Cinza", 4)
    carro2.darPartida()
    carro2.acelerar()
    carro2.frear()
    carro2.frear()
    println("----###----###----")
    println()

    val carro3: Carro = Hyundai("HB20", 2020, 30000.0, "Vermelho", 4)
    carro3.darPartida()
    carro3.acelerar()
    carro3.frear()
    carro3.frear()
    println("----###----###----")
    println()
}