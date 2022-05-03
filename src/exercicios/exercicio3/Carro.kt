package exercicios.exercicio3

open class Carro(
    var marca: String,
    var ano: Int,
    var valor: Double,
    var cor: String,
    var portas: Int,
) {
    open var velocidade: Double = 0.0

    open fun darPartida(){
        println("Iniciando o motor... minha velocidade está em $velocidade km/h")
    }

    open fun frear(){}

    open fun acelerar(){}
}