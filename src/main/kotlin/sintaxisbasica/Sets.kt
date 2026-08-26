package dev.movil.sintaxisbasica

fun main(){
    println("LIST")
    var pets=mutableListOf<String>("Boby","Michi","Rex")
    pets.add("Boby")
    println(pets)

    println("SET")
    var petsSet = mutableSetOf<String>("Boby","Michi","Rex")
    var nombre_pet: String="Michi"
    petsSet.add(nombre_pet)
    if(!petsSet.add(nombre_pet)) println("$nombre_pet ya esta en la lista")
    println(petsSet)
}