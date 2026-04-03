/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author tbona
 */
public class Triangulo {
    
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;
    
    public Triangulo(){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public void fill(){
        
    }
    
    public boolean isColinear(Ponto pB, Ponto pC){
        if(this.Determinante(pB, pC) == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void perimetro(){
        
    }
    
    public double area(Ponto pB, Ponto pC){
        double det = this.Determinante(pB, pC);
        
        double areaTriang = 0.0;
        if(det != 0){
            areaTriang = det/2.0;
        }
        return areaTriang;
    }
}
