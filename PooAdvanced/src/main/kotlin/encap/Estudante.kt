package encap

class Estudante(private var nome: String, private val ra: Int) {

    private var nota = 0.0
    private val listMateria = mutableListOf<String>()

    init {
        //Exceção - Medida que o programa utiliza caso alguma regra seja descumprida
        //que leva o programa a ser finalizado
        if(nome == "" || ra <= 0){
            /*
            throw Exception(mensagem)
             */
            throw Exception("A classe foi instanciada de maneira incorreta!")
        }
    }

    fun alterarNota(valor: Double){
        if(valor < 0 || valor > 10){
            println("Nota inválida")
        }else{
            nota = valor
            println("Nota alterada com sucesso!")
        }
    }

    fun addMateria(valor: String){
        if(valor != "" && valor.length <= 20){
            listMateria.add(valor)
            println("Matéria adicionada")
        }else{
            println("Matéria Inválida")
        }
    }

    fun exluirMateria(valor: String){
        if(listMateria.contains(valor)){
            listMateria.remove(valor)
        }else{
            println("Valor não existe na lista")
        }
    }

}