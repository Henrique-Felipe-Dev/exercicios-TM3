import kotlin.math.pow

fun main(){

    /*
    println("Digite o valor 1: ")
    val num1 = readln().toInt()

    println("Digite o valor 2: ")
    val num2 = readln().toInt()

    println("A soma entre $num1 e $num2 é: ${soma(num1, num2)}")
     */

    println("Digite o valor: ")
    val num1 = readln().toDouble()

    println("Digite o expoente: ")
    val num2 = readln().toDouble()

    println("O resultado da potência entre $num1 no expoente $num2 é: ${pot(num1, num2)}")

}

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun pot(valor: Double, exp: Double): Double{
    return valor.pow(exp)
}