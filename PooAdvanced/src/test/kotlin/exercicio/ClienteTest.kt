package exercicio

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ClienteTest {

    val clienteTest = Cliente("Teste")

    @Test
    fun totalItensTest() {
        assertEquals(0, clienteTest.totalItens())
    }

    @Test
    fun addCompraTest() {

        clienteTest.addCompra("Toddy")
        clienteTest.addCompra("Macarrão")
        clienteTest.addCompra("Molho de Tomate")

        assertEquals(3, clienteTest.totalItens())

        assertTrue(clienteTest.verificarItem("Toddy"))

    }

    @Test
    fun removeCompraTest() {

        clienteTest.addCompra("Toddy")
        clienteTest.addCompra("Macarrão")
        clienteTest.addCompra("Molho de Tomate")

        clienteTest.removeCompra("Macarrão")

        assertFalse(clienteTest.verificarItem("Macarrão"))
        assertEquals(2, clienteTest.totalItens())

    }

}