package exercicios.exercicio3

class Fiat(marca: String,
           ano: Int,
           valor: Double,
           cor: String,
           portas: Int):
    Carro(marca, ano, valor, cor, portas) {

    override var velocidade = 3.0

    override fun acelerar() {
        velocidade += 12.0
        println("Acelerando... minha velocidade está em $velocidade km/h")
    }

    override fun frear() {
        if(velocidade - 6 > 0) {
            velocidade -= 6.0
            println("Freando... minha velocidade está em $velocidade km/h")
        }else{
            velocidade = 0.0
            println("Carro está parado")
        }
    }
}