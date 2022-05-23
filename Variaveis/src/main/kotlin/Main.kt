import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    /*
    Variaveis e seus tipos

    var identificador: Tipo = valor

    Int - Que armazena valores inteiros (ex: 1, 2, 3...)
    Double - Armazena números reais (ex: 1.5, 6.7, 5.6...)
    Char - Armazena apenas um caracter (ex: K, M, J...)
    String - Armazena uma cadeia de caracteres (ex: uma frase, um nome,
    lembrando que toda a cadeia de caracteres é representada por "")
    Boolean - Armazenar valores lógicos (true ou false)

     */

    //Exemplo de declaração

    /*
    var num: Int = 9

    var num2: Double = 5.4
     */

    //Type Inference - Adiciona o tipo da variável por meio do valor passado na
    //declaração

    //var nome = true

    //Exemplo prático do uso das variáveis

    //readLine() - Scanner - readLn()

    /*
    var nome = "Henrique"
    var idade = 21
    var altura = 1.75
    var comidaFavorita = "Temaki"

    //Concatenação usando + (forma que funciona, mas não é a mais utilizada) ou
    // $ (forma que nós mais utilizaremos)

    println("Olá, meu nome é $nome, tenho $idade anos de idade, tenho ainda" +
            " $altura de altura e minha comida favorita é $comidaFavorita")
     */

    //Exemplo utilizando o Scanner

    /*
    var leitura = Scanner(System.`in`)

    print("Digite seu nome: ")
    var nome = leitura.next()

    print("Digite sua idade: ")
    var idade = leitura.nextInt()

    print("Digite a sua altura: ")
    var altura = leitura.nextDouble()

    println("Olá, meu nome é $nome, tenho $idade anos de idade e tenho ainda" +
            " $altura de altura.")
     */


    //Exemplo utilizando readLine()

    /*
    print("Digite seu nome: ")
    var nome = readln()

    print("Digite sua idade: ")
    //Conversão de Tipos - toTipo()
    var idade = readln().toInt()

    print("Digite a sua altura: ")
    var altura = readln().toDouble()

    println("Olá, meu nome é $nome, tenho $idade anos de idade e tenho ainda" +
            " $altura de altura.")
     */

    /*

    Operadores Aritméticos

    Adição +
    Subtração -
    Multiplicação *
    Divisão /
    Módulo %

     */

    //Exemplo utilizando cálculo

    /*
    print("Digite o nome do funcionário: ")
    var nome = readln()

    println("Digite o salário dele: ")
    print("R$")
    var sal = readln().toDouble()

    var bonus = sal * 0.2

    println("O salário do funcionário, com 20% de bonus é: R$${sal + bonus}")
     */

    //Exercício
    /*
    Faça um programa em que o usuário digite o diâmetro de um
    círculo e calcule a área e o perímetro dele
     */

    print("Digite o diâmetro do círculo: ")
    val diametro = readln().toDouble()

    val raio = diametro / 2
    val pi = 3.14

    val area = pi * raio.pow(2)
    val perimetro = 2 * pi * raio

    //Formatar número format(valor)
    //Padrão para formatar - "%.2f".format(valor)


    println("Com base no diâmetro $diametro, temos: ")
    println("Área = ${"%.2f".format(area)}")
    println("Perímetro = ${"%.2f".format(perimetro)}")

    /*

    var - valores que podem mudar (mutáveis)
    val - são valores constantes (imutáveis)

     */

}