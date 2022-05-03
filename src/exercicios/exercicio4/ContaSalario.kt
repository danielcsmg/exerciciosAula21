package exercicios.exercicio4

class ContaSalario: Conta() {
    override var valor: Double = 1212.0

    override val tipoDeConta: Int
        get() = 3

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