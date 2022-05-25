package polimorfismo

fun main(){

    soma(4, 5)

    soma(4.0, 5.0)

}

/*

    Sobrecarga de Métodos - Usar a mesma função com parâmetros diferentes

    Sobrescrita - Utilizar uma função existente, mas executando coisas diferentes
    quando ela for chamada

 */

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun soma(n1: Double, n2: Double): Double{
    return n1 + n2
}