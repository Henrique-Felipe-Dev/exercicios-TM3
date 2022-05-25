package exercicio.abstractExc

abstract class Animal3 (var nome: String, var idade: Int) {

    open fun emitirSom(){
        println("Emitindo som:")
    }
    abstract fun deslocamento()

}