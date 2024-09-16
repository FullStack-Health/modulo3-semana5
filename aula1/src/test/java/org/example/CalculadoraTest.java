package org.example;

import org.junit.jupiter.api.*;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    public static void setup(){
        // setup -> given
        calculadora = new Calculadora();
    }

    @AfterAll
    public static void shutdown(){
        System.out.println("shutdown");
    }

    @BeforeEach
    public void setupEach(){
        // setup -> given
        calculadora = new Calculadora();
    }

    @AfterEach
    public void afterEach(){
        // setup -> given
        calculadora = new Calculadora();
    }


    @Test
    void soma() {

        // execucao -> when
        double resultado =calculadora.soma(1.0,2.2);

        // validacao -> then
        assertEquals(3.2, resultado);
        assertNotEquals(4.0, resultado);
    }

    @Test
    void somaTEst() {

        BigDecimal resultado = BigDecimal.valueOf(2.2)
                .add(BigDecimal.valueOf(1.1));

        assertEquals(BigDecimal.valueOf(3.3), resultado);
    }

}