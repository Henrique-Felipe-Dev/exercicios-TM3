package interfaces

interface FuncionarioTop {

    var cod: String
    var bonus: Double
    var pisoSal: Double
    var sal: Double

    fun calcularSalario()

}