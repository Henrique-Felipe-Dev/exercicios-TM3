package interfaces

open class Ronaldo(
    override var nome: String, override var idade: Int, override var cpf: String,
    override var cod: String,
    override var bonus: Double,
    override var pisoSal: Double
) : PessoaFisica, FuncionarioTop{

    override var sal = 0.0

    override fun andar() {
        println("Andando como o Ronaldo")
    }

    override fun correr() {
        println("Correndo como o Ronaldo")
    }

    fun chutarABola(){
        println("Chutando a bola diretamente pro gol")
    }

    override fun calcularSalario() {
        sal = pisoSal + bonus
    }
}