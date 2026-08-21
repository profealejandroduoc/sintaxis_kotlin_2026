package dev.movil.sintaxisbasica

fun main(){
    var edad: Int=50

    if (edad < 18) {
        println("Es un puberto..")
    }
    else if(edad>18 && edad<60){
        println("Es adulto")
    }
    else{
        println("Es Tatita")
    }
    println("\nCON WHEN...")

    when{
        edad<18->println("Me da ansiedad---AIUDAAAA #ansiedad")
        edad>=18 && edad<60->println("Es adulto")
        edad>=60->println("Tatita")
    }
}