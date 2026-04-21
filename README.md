## Integrantes

- Michelle Dayanna Duque Marin
- Ana Yiseth Solarte Ruiz

  Grupo: 411





# Parcial 2 - Batalla de Criaturas

Este proyecto es una simulación de batallas entre criaturas utilizando programación orientada a objetos en Java. Implementa conceptos como **herencia, polimorfismo, interfaces y composición**.

Cada criatura posee atributos básicos como vida y fuerza, y puede equipar armas que modifican su poder de ataque. Además, algunas criaturas cuentan con habilidades especiales como magia o vuelo.

---

## Conceptos aplicados

- Herencia (clase abstracta `Criatura`)
- Polimorfismo (métodos `atacar` y `defender`)
- Interfaces (`Magico`, `Volador`)
- Composición (`Arma` dentro de las criaturas)
- Sobreescritura de métodos
- Encapsulamiento

---

## Estructura del proyecto

plaintext
src/main/java/com/parcial2/
│
├── Main.java
│
├── batalla/
│   └── Simulador.java
│
├── criatura/
│   ├── Criatura.java
│   ├── Dragon.java
│   ├── Guerrero.java
│   └── Mago.java
│
├── equipamiento/
│   └── Arma.java
│
└── interfaz/
    ├── Magico.java
    └── Volador.java
    
  ---

  ## Funcionalidades

- Sistema de combate por turnos
- Ataques físicos y mágicos
- Reducción de daño mediante defensa
- Uso de armas con daño adicional
- Criaturas con habilidades especiales:
  - Dragón: puede volar y usar magia
  - Mago: usa hechizos
  - Guerrero: combate cuerpo a cuerpo con defensa mejorada


---

## Requisitos

- Java 17 o superior
- Maven 3.8+

---

## Compilación del proyecto

Compilar el proyecto con Maven:

```bash
mvn clean package