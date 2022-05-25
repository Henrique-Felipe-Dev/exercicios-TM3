package exercicio.interfacesExc

class Cavalo(override var nome: String, override var idade: Int) : Animal {

    override fun emitirSom() {
       println("Pocotó")
    }

    override fun deslocamento() {
        println("Correndo como um cavalo!")
    }
}