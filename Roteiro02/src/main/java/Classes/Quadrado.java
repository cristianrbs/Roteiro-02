package Classes;
import Classes.Ponto;

public class Quadrado {
    private Ponto p1, p2, p3, p4;
    
    public Quadrado(){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    public void fill(){
        System.out.println("  P1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("  P2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("  P3: (" + p3.getX() + ", " + p3.getY() + ")");
        System.out.println("  P4: (" + p4.getX() + ", " + p4.getY() + ")");
    }
    
    public double distancia(Ponto a, Ponto b){
        double distancia =  Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
        return distancia;
    }
    
    public double area(){
        double lado = distancia(p1,p2);
        double area = lado * lado;
        return area;
    }
    
    public double perimetro(){
        double perimetro = distancia(p1,p2) * 4;
        return perimetro;
    }
    
    public boolean isQuadrado(){
        double lado1 = distancia(p1, p2);
        double lado2 = distancia(p2, p3);
        double lado3 = distancia(p3, p4);
        double lado4 = distancia(p4, p1);

        double diagonal1 = distancia(p1, p3);
        double diagonal2 = distancia(p2, p4);

        boolean ladosIguais = false;
        if((lado1 == lado2) && (lado2 == lado3) && (lado3 == lado4)){
            return ladosIguais = true;
        }
        
        boolean diagonaisIguais = false;
        if(diagonal1 == diagonal2){
            return diagonaisIguais = true;
        }

        boolean anguloReto = false;
        if(Math.pow(diagonal1, 2) == Math.pow(lado1, 2) + Math.pow(lado2, 2)){
            return anguloReto = true;
        }
        return false;
    }
}
