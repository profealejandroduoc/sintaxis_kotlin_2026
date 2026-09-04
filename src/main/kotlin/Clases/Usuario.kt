package dev.movil.Clases

import kotlin.properties.Delegates

class Usuario(
    val nome: String,
    val sobrenome: String,)
{
    private var sueldo=0;

    fun setSueldo(sueldo:Int){
        this.sueldo = sueldo;
    }

    fun getSueldo():Int = sueldo;

}