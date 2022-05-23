class Aviao (
    var turbina: Int,
    var asas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var modelo: String
        ){

    var voando = false
    var luzes = false

    /*
    Métodos - Voar, Pousar, LigarLuzes
     */

    fun voar(){
        if(voando){
            println("O avião já está no ar")
        }else{
            voando = true
            println("O avião vai voar")
        }
    }

    /*
    if(sla)
     */

    fun pousar(){
        if(voando){
            voando = false
            println("O avião acabou de pousar")
        }else{
            println("O avião já está no chão")
        }
    }

    fun ligDesligLuzes(){
        if(luzes){
            luzes = false
            println("Luzes estão desligadas")
        }else{
            luzes = true
            println("Luzes estão ligadas")
        }
    }

}