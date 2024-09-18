package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeEach
    public void setup(){
        calculadora = new Calculadora();
    }

    @Test
    void somar() {
        Double resultado = calculadora.somar(1.0, 2.2);
        assertEquals(3.2, resultado);
    }

    @Test
    void dividir() {
        Double resultado = calculadora.dividir(40.5, 5.0);
        assertEquals(8.1, resultado);
    }

    @Test
    void multiplicar() {
        Double resultado = calculadora.multiplicar(9.1, 4.2);
        assertEquals(38.22, resultado);
    }

    @Test
    void hipotenusa() {
        Double resultado = calculadora.hipotenusa(3.0, 4.0);
        assertEquals(5.0, resultado);

    }
}