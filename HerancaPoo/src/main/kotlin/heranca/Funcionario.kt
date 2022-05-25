package heranca

class Funcionario (
    nome: String, idade: Int, rg: String, var cod: Int, var funcao: String
    ) : Pessoa(nome, idade, rg) {

    private var salario = 0.0

    fun mostrarSalario(){
        println("O salário do funcionário é R$$salario")
    }

}