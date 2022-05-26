package t07e04;

public class Gerente extends Funcionario {
    private String[] Funcionarios;
    
    public Gerente(String nome, String endereco, int idade, int cpf, double salario, String[] Funcionarios) throws GerenteException {
        super(nome, endereco, idade, cpf, salario);
        
        if(Funcionarios.length >= 5) {
            this.Funcionarios = Funcionarios;
        } else {
            throw new GerenteException();
        }
    }
    
    public double getBonus() {
        return (2 * super.getSalario()) + (100 * Funcionarios.length);
    }
}
