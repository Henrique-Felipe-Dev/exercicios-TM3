fun main (){

    /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */

    val aviao = Aviao(
        2,
        2,
        "Vermelho",
        true,
        "Gol"
    )

    aviao.ligDesligLuzes()

    aviao.voar()

    aviao.pousar()

    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()
    aviao.ligDesligLuzes()

}