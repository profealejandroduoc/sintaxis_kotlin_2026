package dev.movil.sintaxisbasica

fun main(){
 var petsMap = mutableMapOf("Michi" to "Gato","Rex" to "Perro","Firu" to "Perro")
    println(petsMap)
    println(petsMap["Firu"])
    petsMap.put("Copito","Gato")
    println(petsMap)
    petsMap.remove("Rex")
    println(petsMap)

   /*UN DICCIONARIO ES COMO DOS LISTAS
   * keys=("Firu","Michi")
   * values=["Perro","Gato"]
   * */

    for ((k,v) in petsMap) {
       println("$k: $v")
    }

   for (k in petsMap.keys){
      println(k)
   }

   for (v in petsMap.values){
      println(v)
   }
}
