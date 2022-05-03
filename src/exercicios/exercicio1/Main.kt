package exercicios.exercicio1

fun main() {
    val livrosRomance: ArrayList<Romance> = ArrayList()
    livrosRomance.add(Romance())
    livrosRomance.add(Romance())
    livrosRomance.add(Romance())
    livrosRomance.add(Romance())

    livrosRomance[0].registraLivro(122334)
    livrosRomance[1].registraLivro(122334, "Dom Casmurro")
    livrosRomance[2].registraLivro(122334, "Os Miseráveis", "Romance")
    livrosRomance[3].registraLivro(122334, "Romeu e Julieta", "Romance", "Shakespeare")

    val livrosAventura: ArrayList<Aventura> = ArrayList()
    livrosAventura.add(Aventura())
    livrosAventura.add(Aventura())
    livrosAventura.add(Aventura())
    livrosAventura.add(Aventura())

    livrosAventura[0].registraLivro(123121)
    livrosAventura[1].registraLivro(546576, "Percy Jackson")
    livrosAventura[2].registraLivro(989899, "Sherlock Holmes", "Aventura")
    livrosAventura[3].registraLivro(312442, "O Hobbit","Aventura", "JRR Tolkien")

    val livrosCientificos: ArrayList<Cientifico> = ArrayList()

    livrosCientificos.add(Cientifico())
    livrosCientificos.add(Cientifico())
    livrosCientificos.add(Cientifico())
    livrosCientificos.add(Cientifico())

    livrosCientificos[0].registraLivro(123154)
    livrosCientificos[1].registraLivro(548876, "Cosmos")
    livrosCientificos[2].registraLivro(988888, "A Origem das Espécies", "Científico")
    livrosCientificos[3].registraLivro(377877, "Sapiens","Científico", "Yuval Harari")

}
