package forma;

public class Quadrado extends Forma{
    private double lado;
    
    public Quadrado(double lado){
        super(2);
        this.lado = lado;
    }

    @Override
    public double cm2() {
        return this.lado * this.lado;
    }
    
    
    
    
}
