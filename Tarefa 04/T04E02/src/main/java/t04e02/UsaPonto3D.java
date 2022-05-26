package t04e02;

public class UsaPonto3D {

    public static void main(String[] args) {
        Ponto3D p1 = new Ponto3D(4.0, -8.0, -9, "azul", "alta");
        Ponto3D p2 = new Ponto3D(2.0, -3.0, -5.0, "vermelha", "baixa");
        
        double distancia = p1.calculaDistancia(p2);
        
        System.out.printf("\nA distância entre p1 e p2 é: %.2f\n\n", distancia);
    }
    
}
