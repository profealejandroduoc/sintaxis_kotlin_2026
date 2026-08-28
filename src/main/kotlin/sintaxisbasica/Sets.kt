package dev.movil.sintaxisbasica

fun main(){
    /*ACA PUEDO REPETIR DATOS*/
    println("LIST")
    var pets=mutableListOf<String>("Boby","Michi","Rex")
    pets.add("Boby")
    println(pets)

    /*ACA NO ACEPTA REPETIDOS*/
    println("SET")
    var petsSet = mutableSetOf<String>("Boby","Michi","Rex")
    var nombre_pet: String="Michi"
    petsSet.add(nombre_pet)
    if(!petsSet.add(nombre_pet)) println("$nombre_pet ya esta en la lista")
    println(petsSet)
}