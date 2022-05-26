package forma;

public abstract class Forma {
    private double medida[];
    
    public Forma(int numM){
        medida = new double[numM];
    }
    
    public double getMedida(int i){
        if((i > 0) || (i < medida.length)){
            return medida[i];
        }else{
            return -1;
        }
    }
    
    protected void setMedida(int i, double cm){
        if((i > 0) || (i < medida.length) || (cm < 0)){
            medida[i] = cm;
        }
    }
    
    public int getNumMedidas(){
        return medida.length;
    }
    
    public abstract double cm2();
}
