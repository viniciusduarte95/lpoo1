package t06e06;

public class Triangulo extends Forma {
    public Triangulo(double l1, double l2, double l3) {
        super(3);
        setMedida(0, l1); 
        setMedida(1, l2); 
        setMedida(2, l3);
    }
    
    public double area() {
        double sp = (getMedida(0) + getMedida(1) + getMedida(2))/2;
        double aux = sp * (sp - getMedida(0)) * (sp - getMedida(1)) * (sp - getMedida(2));
        return Math.sqrt(aux);
    }
}
