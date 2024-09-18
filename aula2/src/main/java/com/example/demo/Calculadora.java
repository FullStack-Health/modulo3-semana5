package com.example.demo;

public class Calculadora {

    public Double somar(double v, double v1) {
        return v+v1;
    }

    public Double dividir(double v, double v1) {
        return v/v1;
    }

    public Double multiplicar(double v, double v1) {
        return v*v1;
    }

    public Double hipotenusa(double v, double v1) {
        return Math.sqrt((v*v) + (v1*v1));
    }
}
