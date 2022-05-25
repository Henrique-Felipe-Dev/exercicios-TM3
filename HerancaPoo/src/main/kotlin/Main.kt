import heranca.Estudante
import heranca.Funcionario

fun main() {

    /*
    O que aprenderemos?

    Herança - Classes pais (superclasses) e classes filhas

    Polimorfismo - Usar métodos com o mesmo nome, mas que executam coisas diferentes

    Classes abstratas - Classes pais que não podem ser instanciadas, apenas seus filhos
    que poderão criar novos objetos

    Interface - Interfaces que vão servir como um contrato entre ela e suas filhas

    Pessoa - Classe Pai

    Funcionario e Estudante - classes filhas

     */

    //Classe Funcionario
    /*
    val funcionario = Funcionario(
        "Henrique",
        21,
        "000000000",
        123,
        "Desenvolvedor"
    )

    funcionario.corDoCabelo = "Castanhos"

    funcionario.correr()

    funcionario.mostrarSalario()
     */

    //Classe Estudante
    /*
    val estudante = Estudante(
        "Henrique",
        21,
        "000000",
        "000000000000"
    )

    estudante.corDoCabelo = "ruivo"

    estudante.exibirNota()

    estudante.mostrarCorDaPele()

    println(estudante.corDoCabelo)

    estudante.correr()

    println(estudante)
     */

}

