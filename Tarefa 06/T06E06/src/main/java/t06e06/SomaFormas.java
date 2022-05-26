package t06e06;

public class SomaFormas {
    public static double somaAreaFormas(Forma[] listaFormas) {
        double soma = 0.0;
        
        for(int i = 0; i < listaFormas.length; i++) {
            soma += listaFormas[i].area();
        }
        
        return soma;
    }
}
