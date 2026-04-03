package com.mycompany.roteiro02;
import Classes.Quadrado;


public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.fill();

        System.out.println("------------------------------");
        System.out.println("Informacoes do Quadrado");
        System.out.println("------------------------------");
        quadrado.imprimir();
        System.out.println("Area: " + quadrado.area());
        System.out.println("Perimetro: " + quadrado.perimetro());
        System.out.println("Eh um quadrado? " + quadrado.isQuadrado());
    }
}
