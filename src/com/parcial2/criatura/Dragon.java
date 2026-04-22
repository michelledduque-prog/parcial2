package com.parcial2.criatura;

import com.parcial2.interfaz.Volador;

public class Dragon extends Criatura implements Volador {
    private String escamas;
    private Arma arma; // Composición

    public Dragon(String nombre, int salud, int fuerza, String escamas) {
        super(nombre, salud, fuerza);
        this.escamas = escamas;
    }

    public void setArma(Arma arma) { this.arma = arma; }

    @Override
    public void atacar(Criatura objetivo) {
        int dañoTotal = (this.fuerza * 2) + (arma != null ? arma.getDañoAdicional() : 0);
        System.out.println("\n " + nombre + " vuela alto y lanza una llamarada!");
        if (arma != null) arma.atacarConArma(objetivo);
        objetivo.defender(dañoTotal);
    }

    @Override
    public void defender(int daño) {
        this.salud -= daño;
        System.out.println(" El dragón protege sus escamas " + escamas + ". Salud: " + (salud > 0 ? salud : 0));
    }

    public void volar() { System.out.println(nombre + " está en el aire."); }
    public void aterrizar() { System.out.println(nombre + " aterrizó."); }
}