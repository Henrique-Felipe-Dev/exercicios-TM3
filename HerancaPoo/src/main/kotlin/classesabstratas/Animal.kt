package classesabstratas

abstract class Animal (var orgaos: Boolean, var tipoPele: String, var carnivoro: Boolean){

    /*
    Gerar métodos abstratos
     */

    abstract fun correr()

    abstract fun morder()

    fun comer(){
        println("Comendo")
    }

}