package com.parcial2.criatura;

public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    public void embestida(Criatura objetivo) {
        int daño = calcularDañoBase() + 6;
        objetivo.defender(daño);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int daño = calcularDañoBase() + 4;
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        recibirDaño(Math.max(daño - 3, 0));
    }
}
// Confirmando subida a GitHub