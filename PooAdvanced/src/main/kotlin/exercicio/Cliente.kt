package exercicio

class Cliente(private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val listCompras = mutableListOf<String>()

    init {
        if(nome == ""){
            throw Exception("A classe foi instanciada da maneira incorreta!")
        }
    }

    //Construtores
    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String)
            : this(nome, endereco) {
        this.telefone = telefone
    }

    fun addCompra(compra: String){
        if(compra != ""){
            listCompras.add(compra)
            println("\nItem adicionado")
        }else{
            println("\nO Item não pode ser vazio!")
        }
    }

    fun removeCompra(compra: String){
        if(listCompras.contains(compra)){
            listCompras.remove(compra)
            println("\nItem removido!")
        }else{
            println("\nO Item não existe na lista!")
        }
    }

    fun listCompras(){
        println("\n***Lista de Compras\n")
        listCompras.forEach {
            println(it)
        }
        println()
    }

    fun totalItens(): Int{
        return listCompras.size
    }

    fun verificarItem(item: String): Boolean{
        return listCompras.contains(item)
    }

}