ackage com.parcial2.criatura;

import com.parcial2.equipamiento.Arma;

public abstract class Criatura {

    private final String nombre;
    private int salud;
    private final int fuerza;
    private Arma arma;

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public int getSalud() { return salud; }
    public boolean estaViva() { return salud > 0; }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public int calcularDañoBase() {
        return fuerza + (arma != null ? arma.getDañoAdicional() : 0);
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
    }

    public abstract void atacar(Criatura objetivo);
    public abstract void defender(int daño);
}