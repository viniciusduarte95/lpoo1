package t04e01;

public class UsaPessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.nome = "Joao Carlos Neto da Silva Pereira Braga dos Santos Costa Santiago";
        p.idade = 13;
        p.endereco = "Rua Primeiro Tenente Augusto Rocha de Lima e Terezinha Apolinário";
        
        p.imprime();
        
        p.fazAniversario();
        p.fazAniversario();
        p.fazAniversario();
        
        System.out.println("################");
        
        p.imprime();
    }
    
}
