package exercicios.exercicio4

class ContaPoupanca: Conta() {
    override val tipoDeConta: Int
        get() = 1

    fun tipoDeConta(){
        mostrarTipoDeConta()
    }


    override fun depositar(saldo: Double){
        println("O empregador está fazendo o depósito? sim ou não:")
        val opc = readln()
        if (opc == "sim"){
            if (saldo<0.0){
                println("Não é possível depositar este valor!")
            }else{
                valor += saldo
            }
        }else if(opc == "não"){
            println("Conta Salário só pode receber depósito do empregador!")
        }else{
            println("Esta opção é inválida!")
        }
    }
}