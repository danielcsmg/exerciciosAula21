package exercicios.exercicio4


class ContaCorrente(valorInformado: Double): Conta() {
    override var valor: Double = valorInformado

    override val tipoDeConta: Int
        get() = 2

    fun tipoDeConta(){
        mostrarTipoDeConta()
    }

    override fun depositar(saldo: Double){
        if (saldo < 0.0 || saldo > 5000.0){
            println("Operação inválida, procure a sua agência.")
        }else{
            valor += saldo
            println("Saldo atual: $saldo")
        }
    }
}