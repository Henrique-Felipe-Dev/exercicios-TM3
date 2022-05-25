package exercicio.openclassExc

open class Animal2 (var nome: String, var idade: Int) {

    open fun emitirSom(){
        println("Emitindo som:")
    }

    open fun deslocamento(){
        println("Se deslocando:")
    }

}