package entidad;

import java.io.Serializable;

public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    public Snack() {
        this.idSnack = ++Snack.contadorSnacks;
    }

    public Snack(String nombre, double precio) {
        this(); // Llamar al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }
}