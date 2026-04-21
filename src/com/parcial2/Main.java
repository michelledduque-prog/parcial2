package com.parcial2;

import com.parcial2.batalla.Simulador;
import com.parcial2.criatura.*;
import com.parcial2.equipamiento.Arma;

public class Main {

    public static void main(String[] args) {

        Dragon dragon = new Dragon("Colmillo", 66, 15);
        Mago mago = new Mago("Sombra", 70, 9);
        Guerrero guerrero = new Guerrero("Acero", 85, 11);

        Arma espada = new Arma("Espada", 10, 4);
        Arma baston = new Arma("Bastón", 6, 2);

        dragon.equiparArma(espada);
        guerrero.equiparArma(baston);

        mago.aprenderHechizo();
        dragon.aprenderHechizo();

        Simulador.simularBatalla(dragon, mago);
        Simulador.simularBatalla(guerrero, mago);
    }
}