package com.parcial2.criatura;

public abstract class Criatura {

    protected String nombre;
    protected int salud;
    protected int fuerza;

    protected Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    // Métodos abstractos definidos en el Requisito 1
    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);

    // Método concreto para verificar estado de salud
    public boolean estaViva() {
        return this.salud > 0;
    }

    public String getNombre() {
        return nombre;
    }
}