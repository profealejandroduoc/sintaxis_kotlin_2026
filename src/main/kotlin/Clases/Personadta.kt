package dev.movil.Clases

data class Personadta(
    var nombre: String,
    var apellido: String,
    var edad: Int,
    var EstadoCivil: EstadoCivilSealed
)