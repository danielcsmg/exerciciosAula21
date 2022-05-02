package exercicios.exercicio1

import kotlin.system.exitProcess

class SistemaBiblioteca {
    private var livros: ArrayList<Livros> = ArrayList()
    private var livro: Livros = Livros()


    fun mostrarLivros(){
        livros.forEach{
            it.mostrarLivro()
        }
    }

    fun registrarLivros() {
        var opc = 0
        while (true) {
            println("Digite uma opção:")
            println("0: Sair;")
            println("1: Registrar com ISBN;")
            println("2: Registrar com ISBN e o nome do livro;")
            println("3: Registrar com ISBN, o nome e o gênero do livro;")
            println("4: Registrar com todos os atributos:")
            println()
            opc = readln().toInt()
            registraLivrosOpcao(opc)
            if(opc == 0){
                break
            }
        }
    }

    private fun registraLivrosOpcao(opc: Int) {
        when (opc) {
            0 -> println("Saindo!!!")
            1 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                livro.registraLivro(isbn)
                livros.add(livro)
            }
            2 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do Livro:")
                val nomeLivro = readln()
                livro.registraLivro(isbn, nomeLivro)
                livros.add(livro)
            }
            3 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do Livro:")
                val nomeLivro = readln()
                println("Digite o gênero do Livro:")
                val genero = readln()
                livro.registraLivro(isbn, nomeLivro, genero)
                livros.add(livro)
            }
            4 -> {
                println("Digite o ISBN:")
                val isbn = readln().toInt()
                println("Digite o nome do Livro:")
                val nomeLivro = readln()
                println("Digite o gênero do Livro:")
                val genero = readln()
                println("Digite o nome do autor:")
                val autor = readln()
                livro.registraLivro(isbn, nomeLivro, genero, autor)
                livros.add(livro)
            }
            else -> println("Opção inválida!")
        }
    }
}

