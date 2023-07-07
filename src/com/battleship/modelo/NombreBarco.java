package com.battleship.modelo;
public enum NombreBarco {
    Lancha(2, 2), // 2 lanchas de longitud 2
    Submarino(3, 1), // 1 submarino de longitud 3
    Acorazado(4, 1); // 1 acorazado de longitud 4

    public final int longitud;
    public final int cantidad;

    NombreBarco(int longitud, int cantidad) {
        this.longitud = longitud;
        this.cantidad = cantidad;
    }

    public static String obtenerNombre(int longitud, int numeroBarco) {
        for (NombreBarco barco : NombreBarco.values()) { // values() devuelve un array con todos los valores del enum
            if (barco.longitud == longitud) {
                return barco.name() + " " + numeroBarco; // name() devuelve el nombre del enum
            }
        }
        throw new IllegalArgumentException("Longitud de barco inválida: " + longitud);
    }
}