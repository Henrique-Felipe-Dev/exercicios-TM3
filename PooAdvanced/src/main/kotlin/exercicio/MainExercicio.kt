package exercicio

fun main(){

    /*
    Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
    e pelo menos mais duas opções de construtores conforme sua percepção, com os
    atributos: nome (String), endereço (String), telefone (String), listaDeCompras
    (mutableListOf<Strings>()).

    A classe precisará de métodos para adicionar, remover e listar os itens do
    atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e,
    caso esteja vazio, jogue uma exceção. Ao instanciar a classe cliente na
    função main(), não esquecer de colocar dentro de um bloco try catch.
     */

    while (true){

        print("Digite o seu nome: ")
        val nome = readln()

        print("Digite o seu endereço: ")
        val endereco = readln()

        print("Digite o seu telefone: ")
        val telefone = readln()

        try {
            val cliente = Cliente(nome, endereco, telefone)

            while (true){

                println("\n***Menu***\n")

                println("1 - Adicionar Compras")
                println("2 - Remover Compras")
                println("3 - Listar Compras")
                println("4 - Sair\n")

                print("Opção:")
                val opc = readln().toInt()

                when(opc){

                    1 -> {
                        println("Digite um item para adicionar no carrinho: ")
                        val compra = readln()
                        cliente.addCompra(compra)
                    }

                    2 -> {
                        println("Digite um item para ser removido: ")
                        val compra = readln()
                        cliente.removeCompra(compra)
                    }

                    3 -> {
                        cliente.listCompras()
                    }

                    4 -> break

                    else -> println("Valor Inválido")

                }


            }
            break
        }catch (e: Exception){
            println(e.message)
        }
    }

}