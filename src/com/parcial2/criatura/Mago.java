package com.parcial2.criatura;

import com.parcial2.interfaz.Magico;

public class Mago extends Criatura implements Magico {

    private String hechizos;
    private Arma arma;

    public Mago(String nombre, int salud, int fuerza, String hechizos) {
        super(nombre, salud, fuerza);
        this.hechizos = hechizos;
    }

    public void setArma(Arma arma) { this.arma = arma; }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoTotal = this.fuerza + (arma != null ? arma.getDañoAdicional() : 0);
        lanzarHechizo();
        if (arma != null) arma.atacarConArma(objetivo);
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
        this.salud -= daño;
        System.out.println(" " + nombre + " usa un escudo mágico débil. Salud: " + (salud > 0 ? salud : 0));
    }

    public void lanzarHechizo() { System.out.println("\n " + nombre + " lanza " + hechizos + "!"); }
    public void aprenderHechizo() { System.out.println(nombre + " estudia."); }
}