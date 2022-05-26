package forma;

import java.lang.Math;
import static java.lang.Math.PI;
public class Redondo extends Forma{
    private double raio;
    
    public Redondo(double raio){
        super(1);
        this.raio = raio;
    }
    
    @Override
    public double cm2() {
        return PI * Math.pow(this.raio, 2);
    }
    
}
