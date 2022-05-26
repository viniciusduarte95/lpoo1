package t06e06;

public class Retangulo extends Forma {
    public Retangulo(double altura, double largura) {
        super (2);
        setMedida(0, altura); 
        setMedida(1, largura);
    }

    public double area(){
        return getMedida(0) * getMedida(1);
    }
}