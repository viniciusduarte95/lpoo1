package forma;

public class Triangular extends Forma{
    private double lado;
    
    public Triangular(double lado){
        super(2);
        this.lado = lado;
    }

    @Override
    public double cm2() {
        return (((this.lado * this.lado) * Math.sqrt(3)) / 4);
        //return ((this.lado * this.lado) / 2);
    }
    
}
