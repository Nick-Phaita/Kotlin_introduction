class Hesabu {
    //data member
    private var nambari: Double = 23.45
    private var nambari2: Double = 67.54

    //member function
    fun multiply():Double {
        return nambari * nambari2
    }
}

fun main() {
    //create object
    val obj = Hesabu()
    println("${obj.multiply()}")
}

