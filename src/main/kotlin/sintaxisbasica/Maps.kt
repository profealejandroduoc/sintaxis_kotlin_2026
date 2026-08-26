package dev.movil.sintaxisbasica

fun main(){
 var petsMap = mutableMapOf("Michi" to "Gato","Rex" to "Perro","Firu" to "Perro")
    println(petsMap)
    println(petsMap["Firu"])
    petsMap.put("Copito","Gato")
    println(petsMap)
    petsMap.remove("Rex")
    println(petsMap)

}