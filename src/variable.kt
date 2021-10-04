//Immutable variable
/* another way to comment out, multi-line comments
 */
fun main(args: Array<String>) {
    val jina= "Nick"
    val jina2="Phaita"
//    jina= "Nike" leads to error, cannot be assogned since it's a immutable variable
    println("My first name is "+jina)
    println("My second name is "+jina2)
    println("My full names are "+jina+" "+jina2)

    //Mutable variable
    var shule="eMobilis"
    var shule1="Mobile"
    shule1= "Mobile Technology Institute"
    println(shule+" "+shule1)
}