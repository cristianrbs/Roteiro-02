package com.mycompany.roteiro02;
import Classes.Quadrado;


public class Main {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado();
        quadrado.fill();

        System.out.println("\n=== Informações do Quadrado ===");
        quadrado.imprimir();
        System.out.println("Área: " + quadrado.area());
        System.out.println("Perímetro: " + quadrado.perimetro());
        System.out.println("É um quadrado válido? " + quadrado.isQuadrado());
    }
}
