package exercicios.exercicio4

open class Conta {
    protected open val tipoDeConta = 0
    open var valor: Double = 0.0

    open fun mostrarTipoDeConta(){
        when (tipoDeConta){
            1 -> println("Conta Poupança...")
            2 -> println("Conta Corrente...")
            3 -> println("Conta Salário...")
            else -> println("Opção Inválida")
        }
    }

    fun mostrarValores(){
        println("Seu saldo atual é de: R$ ${"%.2f".format(valor)}")
    }

    open fun depositar(saldo: Double){
        if (saldo<0.0){
            println("Não é possível depositar este valor")
        }else{
            valor += saldo
        }
    }

    fun retirarGrana(valorSaque: Double){
        if(valorSaque > valor){
            println("Não é possível retirar o valor solicitado.")
            println("Seu saldo é de R$${"%.2f".format(valor)}")
        }else{
            valor -= valorSaque
        }
    }

}