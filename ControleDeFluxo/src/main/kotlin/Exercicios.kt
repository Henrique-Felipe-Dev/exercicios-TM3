import kotlin.math.pow
import kotlin.math.sqrt

fun main(){

    /*
    2- Faça um programa que entre com três números e coloque em ordem crescente.
     */

    /*
    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    print("Digite o valor 3: ")
    val num3 = readln().toInt()

    //Sequencia de num1 - num2 - num3
    if(num1 <= num2 && num2 <= num3){
        println("$num1 - $num2 - $num3")
    }else if(num1 <= num3 && num3 <= num2){
        println("$num1 - $num3 - $num2")
    }else if(num2 <= num1 && num1 <= num3){
        println("$num2 - $num1 - $num3")
    }else if(num2 <= num3 && num3 <= num1){
        println("$num2 - $num3 - $num1")
    }else if(num3 <= num1 && num1 <= num2){
        println("$num3 - $num1 - $num2")
    }else{
        println("$num3 - $num2 - $num1")
    }
     */

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.
     */
    /*
    print("Digite um número: ")
    val num = readln().toDouble()

    if(num % 2 == 0.0){
        println("O número $num é par e sua raiz quadrada é: ${
            "%.2f".format(sqrt(num))
        }")
    }else{
        println("O número $num é ímpar e ele elevado ao quadrado é: " +
                "%.2f".format(num.pow(2))
        )
    }
     */

    /*
    1- Faça um programa que receba três inteiros e diga qual deles é o maior.
     */
    /*
    print("Digite o valor 1: ")
    val num1 = readln().toInt()

    print("Digite o valor 2: ")
    val num2 = readln().toInt()

    print("Digite o valor 3: ")
    val num3 = readln().toInt()

    if(num1 > num2 && num1 > num3){
        println("O maior número digitado foi $num1")
    }else if(num2 > num1 && num2 > num3){
        println("O maior número digitado foi $num2")
    }else{
        println("O maior número digitado foi $num3")
    }
     */

    /*
    3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
    categoria ela se encontra:
    10-14 infantil
    15-17 juvenil
    18-25 adulto
     */

    print("Digite a idade para verificarmos em qual categoria você se encontra: ")
    val idade = readln().toInt()

    when(idade){

        in 10..14 -> println("Infantil")
        in 15..17 -> println("Juvenil")
        in 18..25 -> println("Adulto")
        else -> println("Você não se encontra em nenhuma categoria")

    }

}