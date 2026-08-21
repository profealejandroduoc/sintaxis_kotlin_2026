package dev.movil.sintaxisbasica


fun main() {
    val personas = listOf("Wacoldo", "Diogenes", "Wenceslao")

    for(persona in personas)
    {
        println(persona)
    }

    for(i in 1..3)
    {
        println(i)
    }

    for(i in 0..2) println(personas[i])

    for(i in 0..personas.size-1)  println(personas[i])
}
