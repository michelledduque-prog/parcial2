package com.parcial2.batalla;

import com.parcial2.criatura.Criatura;

public class Simulador {

    public static void simularBatalla(Criatura c1, Criatura c2) {

        System.out.printf("Batalla: %s vs %s%n", c1.getNombre(), c2.getNombre());

        int turno = 1;

        while (c1.estaViva() && c2.estaViva()) {

            System.out.println("\nTurno " + turno);

            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }

            turno++;
        }

        Criatura ganador = c1.estaViva() ? c1 : c2;

        System.out.println("\nGanador: " + ganador.getNombre());
    }
}