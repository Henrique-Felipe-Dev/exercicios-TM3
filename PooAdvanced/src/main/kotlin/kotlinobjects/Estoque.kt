package kotlinobjects

object Estoque{

    val nome = "Estoque da Loja do Jóshua"
    val listProdutos = mutableListOf<String>()

    fun addProduto(valor: String){
        listProdutos.add(valor)
    }

    fun mostrarLista(){
        listProdutos.forEach {
            println(it)
        }
    }
}