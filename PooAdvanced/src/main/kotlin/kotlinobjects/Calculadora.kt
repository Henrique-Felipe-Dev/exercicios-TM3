package kotlinobjects

class Calculadora {

    companion object{
        var n1 = 0.0
        var n2 = 0.0

        fun soma(): Double{
            return n1 + n2
        }

        fun sub(n1: Double, n2: Double): Double{
            return n1 - n2
        }

        fun mult(n1: Double, n2: Double): Double{
            return n1 * n2
        }
    }

}