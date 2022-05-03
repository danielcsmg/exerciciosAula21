package exercicios.exercicio4

fun main() {

    val contaPoupanca1 = ContaPoupanca()
    contaPoupanca1.tipoDeConta()
    contaPoupanca1.mostrarValores()
    contaPoupanca1.depositar(-10.0)
    contaPoupanca1.depositar(15.0)
    contaPoupanca1.mostrarValores()
    contaPoupanca1.retirarGrana(20.0)
    contaPoupanca1.retirarGrana(4.0)

    contaPoupanca1.mostrarValores()

    println()
    println("------------####-------------")
    val contaSalario1 = ContaSalario()
    contaSalario1.tipoDeConta()
    contaSalario1.mostrarValores()
    contaSalario1.depositar(5500.0)
    contaSalario1.mostrarValores()
    contaSalario1.retirarGrana(20.0)
    contaSalario1.retirarGrana(4.0)
    contaSalario1.retirarGrana(7000.0)


    println()
    println("------------####-------------")
    val contaCorrente: ContaCorrente = ContaCorrente(300.0)
    contaCorrente.tipoDeConta()
    contaCorrente.mostrarValores()
    contaCorrente.depositar(-10.0)
    contaCorrente.depositar(15.0)
    contaCorrente.depositar(5500.0)
    contaCorrente.mostrarValores()
    contaCorrente.retirarGrana(20.0)
    contaCorrente.retirarGrana(4.0)
    contaCorrente.retirarGrana(7000.0)

}