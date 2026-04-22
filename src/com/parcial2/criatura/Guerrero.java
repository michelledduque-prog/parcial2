package com.parcial2.criatura;

public class Guerrero extends Criatura {

  private Arma arma;

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void setArma(Arma arma) { this.arma = arma; }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoTotal = this.fuerza + (arma != null ? arma.getDañoAdicional() : 0);
        System.out.println("\n " + nombre + " realiza un ataque físico!");
        if (arma != null) arma.atacarConArma(objetivo);
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
        this.salud -= daño;
        System.out.println(" " + nombre + " bloquea con su armadura. Salud: " + (salud > 0 ? salud : 0));
    }
}