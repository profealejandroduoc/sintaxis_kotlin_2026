package dev.movil.sintaxisbasica

fun main(){
    //PARA STRINGS
    var nombre = "Wacoldo"
    var curso:String?="";

    if(curso.isNullOrBlank()){
        print("Curso no definido")
    }else{
        println("$nombre está cursando $curso")
    }

    var numero:Int? = null
    var resultado=numero!!+5 //Verificador de nulos !!
    println("\n"+resultado)

    //EJEMPLO PRACTICO

    val x=4

    var mayor:Int?=null
    if (mayor!!<x || mayor==null){
        mayor=x
    }


}