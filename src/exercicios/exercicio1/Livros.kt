package exercicios.exercicio1

class Livros {
    private var genero: String = ""
    private var nomeLivro: String = ""
    private var isbn: Int = 0
    private var autor: String = ""

    fun registraLivro(isbn: Int){
        this.isbn = isbn
        println("O livro foi registrado com o isbn ${this.isbn}")
    }

    fun registraLivro(isbn: Int, nomeLivro: String){
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        println("O livro foi registrado com o isbn ${this.isbn} e o nome ${this.nomeLivro}")

    }

    fun registraLivro(isbn: Int, nomeLivro: String, genero: String){
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        this.genero = genero
        println("O livro foi registrado com o isbn ${this.isbn}, o nome ${this.nomeLivro} e o ${this.genero}")
    }

    fun registraLivro(isbn: Int, nomeLivro: String, genero: String, autor: String){
        this.isbn = isbn
        this.nomeLivro = nomeLivro
        this.genero = genero
        this.autor = autor
        println("O livro foi registrado com todos os atributos.")
    }

    fun mostrarLivro() {
        println("""Livros(genero='$genero'; 
            |nomeLivro='$nomeLivro'; 
            |isbn=$isbn; 
            |autor='$autor')""".trimMargin())
    }
}