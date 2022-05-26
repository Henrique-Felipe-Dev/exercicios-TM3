import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest{

    /*

    asserts - Vão verificar o que o método precisa retornar para o teste ser validado

    @Test - indicar que a função vai executar um teste unitário

     */

    @Test
    fun somaTest(){

        /*
        Nós vamos verificar se caso a gente chamar a soma e passar os parâmetros
        5 e 6, se ele retorna 11

        assertEquals(valor esperado, método que será executado)
         */

        assertEquals(11, Calculadora.soma(5, 6))
    }

    @Test
    fun subTest(){

        assertEquals(3, Calculadora.subtracao(6, 3))

    }



}