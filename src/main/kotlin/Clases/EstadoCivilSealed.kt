package dev.movil.Clases

sealed class EstadoCivilSealed {
    object Soltero: EstadoCivilSealed()
    object Casado: EstadoCivilSealed()
    object Viudo: EstadoCivilSealed()
    object Divorciado: EstadoCivilSealed()
}