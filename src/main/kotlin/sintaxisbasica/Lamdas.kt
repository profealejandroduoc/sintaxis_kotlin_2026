package dev.movil.sintaxisbasica

fun main(){
    val lista=listOf("Waco","Dio","Wence")
     lista.forEach{p->println("$p")}

    miFuncion("Wacoldo",{imprimirNombre: String->
        println(imprimirNombre)
    })


    print(sumar(5,3,{x,y->x+y}))
}

fun miFuncion(nom: String, saludar: (String) -> Unit) {
    saludar("Hola $nom");
}

fun sumar(x:Int,y:Int, op:(Int,Int)->Int):Int=op(x,y);

