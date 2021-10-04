open class Cars (model: String,colour: String, YOM: Int){
    init {
        println("The model is: $model \nThe colour is: $colour \nThe Year of Make is: $YOM")
    }
}
class Ford(model: String,colour: String,YOM: Int):Cars(model,colour, YOM){
    fun mustang(){
        println("I love Ford Mustang")
    }
}
class Lamborghini(model: String,colour: String,YOM: Int):Cars(model,colour, YOM){
    fun countach(){
        println("I love Lamborghini Countach")
    }
}
class Ferrari(model: String,colour: String,YOM: Int):Cars(model,colour, YOM){
    fun laFerrari(){
        println("I love Ferrari laFerrari")
    }
}
class Mitsubishi(model: String,colour: String,YOM: Int):Cars(model,colour, YOM){
    fun evolution(){
        println("I love Mitsubishi Evolution")
    }
}

fun main(args: Array<String>) {
    val fo= Ford("Mustang","Grey",2017)
    fo.mustang()
    val lam= Lamborghini("Countach","Yellow",2018)
    lam.countach()
    val fer= Ferrari("laFerrari","Red",2019)
    fer.laFerrari()
    val mit= Mitsubishi("Evolution","Blue",2020)
    mit.evolution()
}