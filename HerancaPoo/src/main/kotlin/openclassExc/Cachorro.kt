package exercicio.openclassExc

class Cachorro(nome: String, idade: Int) : Animal2(nome, idade){

    override fun emitirSom() {
        super.emitirSom()
        println("Au Au")

    }

    override fun deslocamento() {
        super.deslocamento()
        println("Correndo")
    }

}