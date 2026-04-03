package com.mycompany.roteiro1;

import classes.Ponto;
import classes.Triangulo;


public class Roteiro1 {

    public static void main(String[] args) {
        
        Ponto pA = new Ponto(1, 2);
       
        Ponto pB = new Ponto(3, 2);
        
        Ponto pC = new Ponto(1, 1);
        
        
        Triangulo T1 = new Triangulo(pA, pB, pC);
        
        T1.imprimir();
        
        System.out.println("A distância do Ponto A e B: " + pA.distanciaDoisPontos(pB));
        System.out.println("A distância do Ponto A e C: " + pA.distanciaDoisPontos(pC));
        System.out.println("A distância do Ponto B e C: " + pB.distanciaDoisPontos(pC));
        
        System.out.println("A área do triângulo é: " + T1.area(pB, pC));
        System.out.println("O Tipo do Triângulo é: " + T1.tipo());
        System.out.println("O Perímetro do Triângulo é: " + T1.perimetro());
    }
}
