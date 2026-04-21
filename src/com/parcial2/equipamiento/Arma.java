package com.parcial2.equipamiento;

import com.parcial2.criatura.Criatura;

public class Arma {
    private final String nombre;
    private final int dañoBase;
    private final int bonoMagico;

    public Arma(String nombre, int dañoBase, int bonoMagico) {
        this.nombre = nombre;
        this.dañoBase = dañoBase;
        this.bonoMagico = bonoMagico;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDañoAdicional() {
        return dañoBase + bonoMagico;
    }
}