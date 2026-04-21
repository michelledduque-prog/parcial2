package com.parcial2.criatura;

import com.parcial2.interfaz.Magico;
import com.parcial2.interfaz.Volador;

public class Dragon extends Criatura implements Volador, Magico {

    private boolean hechizoAprendido = false;

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(getNombre() + " aterriza.");
    }

    public void rugir() {
        System.out.println(getNombre() + " ruge fuertemente.");
    }

    @Override
    public void aprenderHechizo() {
        hechizoAprendido = true;
        System.out.println(getNombre() + " aprendió hechizo.");
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(getNombre() + " lanza un hechizo mágico.");
    }

    public void lanzarHechizo(Criatura objetivo) {
        if (!hechizoAprendido) {
            atacar(objetivo);
            return;
        }
        int daño = calcularDañoBase() * 2;
        objetivo.defender(daño);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = calcularDañoBase() + 5;
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        recibirDaño(Math.max(daño - 4, 0));
    }
}
// Confirmando subida a GitHub