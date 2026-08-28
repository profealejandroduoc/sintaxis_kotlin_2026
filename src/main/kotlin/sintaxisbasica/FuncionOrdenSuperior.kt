package dev.movil.sintaxisbasica

fun main(){
    var a:Int=10;
    var b:Int=2;
    println("La suma $a + $b es ${calcular(a,b,::sumar)} ")
    println("y multiplicacion es ${calcular(a,b,::multiplicar)} ")
}

fun calcular(n1: Int, n2: Int,fn: (Int, Int) -> Int): Int {
    return fn(n1, n2)
}

fun sumar(x: Int, y: Int):Int{
    return x+y;
}

fun multiplicar(x: Int, y: Int)=x*y;