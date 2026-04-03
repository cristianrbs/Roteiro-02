/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.roteiro1;

import classes.Ponto;

/**
 *
 * @author tbona
 */
public class Roteiro1 {

    public static void main(String[] args) {
        
        Ponto pA = new Ponto(4, 7);
        System.out.println(pA.toString());
        
        Ponto pB = new Ponto(7, 9);
        System.out.println(pB.toString());
        
        Ponto pC = new Ponto(5, 6);
        System.out.println(pC.toString());
        
        System.out.println("A distância do Ponto A e B: " + pA.distanciaDoisPontos(pB));
        System.out.println("A distância do Ponto A e C: " + pA.distanciaDoisPontos(pC));
        System.out.println("A distância do Ponto B e C: " + pB.distanciaDoisPontos(pC));
        
        System.out.println("A área do triângulo é: " + pA.area(pB, pC));
    }
}
