package t06e06;

public class UsaForma {
    
    public static void main (String args[]){
        double soma = 0.0;
        
        Retangulo r = new Retangulo(1, 3);
        Triangulo t = new Triangulo (1, 2, 2);
        Circunferencia c = new Circunferencia(2);
        
        Forma[] listaFormas = {r, t, c};
        
        soma = SomaFormas.somaAreaFormas(listaFormas);
        
        System.out.printf("\nA soma das áreas das formas é: %.2f", soma);
    }
    
}
