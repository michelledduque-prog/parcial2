package com.parcial2;

import com.parcial2.criatura.Arma;
import com.parcial2.criatura.Criatura;
import com.parcial2.criatura.Dragon;
import com.parcial2.criatura.Mago;



public class Main {
public static void main(String[] args) {
        // Creación de personajes y armas
        Mago merlin = new Mago("Merlín", 80, 15, "Rayo Solar");
        Dragon smaug = new Dragon("Smaug", 150, 20, "Rojas");
        Arma baculo = new Arma("Báculo Arcano", 10);
        
        merlin.setArma(baculo); // Composición: Equipar arma

        simularBatalla(merlin, smaug);
    }

    public static void simularBatalla(Criatura c1, Criatura c2) {
        System.out.println("=== COMIENZA EL DUELO: " + c1.getNombre() + " VS " + c2.getNombre() + " ===");
        
        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);
            if (c2.estaViva()) {
                c2.atacar(c1);
            }
            System.out.println("-----------------------------------");
        }

        System.out.println("\n🏁 FIN DEL COMBATE");
        String ganador = c1.estaViva() ? c1.getNombre() : c2.getNombre();
        System.out.println(" ¡EL GANADOR ES " + ganador.toUpperCase() + "!");
    }
}