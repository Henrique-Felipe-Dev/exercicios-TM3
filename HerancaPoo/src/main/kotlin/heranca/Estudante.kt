package heranca

class Estudante(

    nome: String, idade: Int, rg: String,
    val ra: String
) : Pessoa(nome, idade, rg) {

    private var nota = 0.0

    fun exibirNota(){
        println("A nota do Estudante é $nota")
    }

    override fun correr() {
        super.correr()
        println("Ufa, corremos como um estudante")
    }

    override fun toString(): String {
        return "Estudante $nome, de RA $ra, que tem a nota $nota"
    }

}