package t06e04;

public class UsaForma {
    
    public static void main (String args[]){
        Superficie c = new Circunferencia(2);
        System.out.println(c.toString());
        System.out.println("Area: " + c.area());
        
        System.out.println("");
        
        Superficie q = new Quadrado(1, 3);
        System.out.println(q.toString());
        System.out.println ("Area: " + q.area());
    }
    
}
