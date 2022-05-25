package exercicio.abstractExc

class Cachorro(nome: String, idade: Int) : Animal3(nome, idade) {

    override fun emitirSom() {
        super.emitirSom()
        println("Au au")
    }

    override fun deslocamento() {
        println("Correndo como um cachorro")
    }
}