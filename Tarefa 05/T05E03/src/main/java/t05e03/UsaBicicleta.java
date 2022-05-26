package t05e03;

public class UsaBicicleta {

    public static void main(String[] args) {
        Bicicleta bc = new Bicicleta(2);
        
        bc.aumentarVelocidade(2);
        bc.mudarCadencia(4);
        bc.mudarMarcha(1);
        bc.printStates();
        
        bc.mudarMarcha(3);
        bc.printStates();
    }
    
}
