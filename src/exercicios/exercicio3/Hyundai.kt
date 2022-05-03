package exercicios.exercicio3

class Hyundai(marca: String,
              ano: Int,
              valor: Double,
              cor: String,
              portas: Int):
    Carro(marca, ano, valor, cor, portas) {

    override var velocidade = 5.0

    override fun acelerar() {
        velocidade += 15.0
        println("Acelerando... minha velocidade está em $velocidade km/h")
    }

    override fun frear() {
        if(velocidade - 2 > 0) {
            velocidade -= 2.0
            println("Freando... minha velocidade está em $velocidade km/h")
        }else{
            velocidade = 0.0
            println("Carro está parado")
        }
    }
}