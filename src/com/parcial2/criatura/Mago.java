package com.parcial2.criatura;

import com.parcial2.interfaz.Magico;

public class Mago extends Criatura implements Magico {

    private boolean hechizoAprendido = false;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void aprenderHechizo() {
        hechizoAprendido = true;
        System.out.println(getNombre() + " aprendió hechizo.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(getNombre() + " lanza hechizo mágico.");
    }

    public void lanzarHechizo(Criatura objetivo) {
        if (!hechizoAprendido) {
            atacar(objetivo);
            return;
        }

        int daño = getFuerza() * 3;
        objetivo.defender(daño);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = calcularDañoBase() + 3;
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        recibirDaño(Math.max(daño - 2, 0));
    }
}