package dev.movil.sintaxisbasica

fun main(){
    var x=5;
    var y=3;

    val suma=x+y;
    println("\nLA SUMA ES $suma")

    val resta=x-y
    println("\nLA RESTA ES $resta")

    val multiplicacion=x.toDouble()*y.toDouble()
    println("\nMULTIPLICACION ES $multiplicacion")

    val division=x/y
    println("\nDIVISION ES $division")
}