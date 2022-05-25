package classesabstratas

class Cachorro(
    orgaos: Boolean, tipoPele: String, carnivoro: Boolean,
    val raiva: Boolean, var adestravel: Boolean
) : Animal(orgaos, tipoPele, carnivoro) {

    fun latir(){
        println("Latindo")
    }

    fun afiarUnhas(){
        println("Afiando as unhas")
    }

    override fun correr() {
        println("Latindo que nem louco pro motoqueiro")
    }

    override fun morder() {
        println("Mordendo como um dog")
    }

    fun proteger(){
        println("Protegendo de forma bem leal")
    }

}