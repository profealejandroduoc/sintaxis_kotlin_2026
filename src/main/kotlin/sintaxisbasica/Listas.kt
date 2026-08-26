package dev.movil.sintaxisbasica

fun main(){
    /*Lista normal*/
    var personas=listOf("Waco","Diogenes","Lucidoro","Tertuliano")
    personas=personas.reversed()
    println(personas)

    println(personas.first())
    println(personas.last())
    println(personas.get(2))
    println(personas[2])
    println(personas.size)

    for (persona in personas) {
        println(persona)
    }

    for(i in 1..personas.size-1) {
        println(personas[i])
    }

    var numeros=listOf<Int>(10,13,20,29,30)
    for (i in numeros) {
        println(i)
    }
    println(numeros.sum())

    var pets=mutableListOf("Cachupin")
    println(pets)
    pets.add("Michi")
    pets.addFirst("Boby")
    pets.set(1,"Rex")
    pets[1]="Tom"
    pets.add(1,"Copito")
    println(pets)
    println(numeros)
    var igual20=numeros.filter{it==20}
    println(igual20)
    var mayores=numeros.filter{it>=20}
    println(mayores)

    var pares=numeros.filter{it%2==0}
    println(pares)

    val sum = numeros.reduce { acc, numero -> acc + numero }
    println(sum)

    pets.forEach { println(it) }


}