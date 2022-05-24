import encap.Estudante
import kotlinobjects.Calculadora
import kotlinobjects.Estoque

fun main() {

    /*

    Companion Object - Atributos e métodos sem precisar instanciar uma classe

    Objetos Anônimos - São objetos que só são instanciados uma única vez

    Encapsulamento - Deixar os nossos dados protegidos

    Exceção - Soltar exceções personalizadas e tratar essas exceções

     */

    /*
    Calculadora.n1 = 5.0
    Calculadora.n2 = 6.0

    Calculadora.soma()
     */


    //Uso de um objeto anônimo
    /*
    print("Digite um produto para jogar no estoque: ")
    val prod = readln()
    Estoque.addProduto("Toddy")

    Estoque.mostrarLista()
     */

    /*
    Encapsulamento

    public - Indica que todos os atributos e métodos da classe serão publicos
    para qualquer arquivo (seja classe, ou um simples método main())

    private - Indica que todos os atributos e métodos da classe serão privados
    para qualquer arquivo (seja classe, ou um simples método main()), ou seja,
    não poderão ser acessados

     */

    //Exemplo prático do try...catch
    /*
    while (true){

        println("Digite o seu nome: ")
        val nome = readln()

        println("Digite seu RA: ")
        val ra = readln().toInt()

        try {
            val adalberto = Estudante(nome, ra)
            break
        }catch (e: Exception){
            println(e.message)
        }

    }
     */

    /*
    Estrutura do try...catch - Fazer o Tratamento de Erros dentro do nosso código

    try{
        código que nós tentaremos executar

    }catch(capturar a exceção){

        código pra ser executado caso aconteça algum erro

    }
     */

    //Exemplo do dia a dia
    try {
        val idade = readln().toInt()
    }catch (e: Exception){
        println(e.message)
    }


}

