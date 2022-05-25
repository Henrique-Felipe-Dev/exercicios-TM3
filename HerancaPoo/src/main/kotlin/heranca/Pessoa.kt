package heranca
/*
Para indicarmos que a classe pode ter filhas, nós marcaremos a classe como open
 */
open class Pessoa (var nome: String, private var idade: Int, private val rg: String) {

    var corDoCabelo = ""

    private var corDaPele = "Pardo"

    fun andar(){
        println("Andando")
    }

    //Para sobrescrever um método ele precisa ser marcado como open
    open fun correr(){
        println("Correndo")
    }

    fun mostrarCorDaPele(){
        println("A cor da pele é $corDaPele")
    }
}