package dev.movil.sintaxisbasica

import kotlin.properties.Delegates

class Usuario(
    val nome: String,
    val sobrenome: String,
){
    var sueldo by Delegates.notNull<Int>();

    fun setSueldo(sueldo:Int){
        this.sueldo = sueldo;
    }

    fun getSueldo():Int = sueldo;

}

