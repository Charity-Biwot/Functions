fun main() {
    person("Yasmin")
    modulus(767, 50)
    sum(23, 26, 456, 821)
    mySelf("")
}

fun person(name:String){
    println("Hello "+ name)
}

fun modulus(x:Int, y:Int){
    var modulus = x%y
    println(modulus)
}

fun sum (w:Int, x:Int, y:Int, z:Int){
    var sum = w + x + y + z
    println(sum)
}

fun mySelf(fact:String){
    var fact = "speaking four different languages"
    println(fact)
}