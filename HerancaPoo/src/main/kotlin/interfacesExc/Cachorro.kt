package exercicio.interfacesExc

class Cachorro(
    override var nome: String, override var idade: Int,
    var corDoPelo: String
) : Animal {

    override fun emitirSom() {
        println("Au au!")
    }

    override fun deslocamento() {
        println("Correndo como um cachorro!")
    }

    override fun toString(): String {
        return "Cachorro com nome $nome, idade $idade e cor do pelo $corDoPelo"
    }

}