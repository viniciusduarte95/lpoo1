package t07e04;

public class SistemaRH {

    public static void main(String[] args) {
        String[] Departamentos = {"Departamento de Desenvolvimento"};
        
        String[] Funcionarios = {"Cleyton Duarte", 
                                "Julinho do Almoxarifado", 
                                "O Sobrinho do Paulo"};
        
        Funcionario[] listaFuncionarios = new Funcionario[3];
        
        try {
            Diretor diretor = new Diretor("Paulinho Peixoto", "Rua das Gracieiras", 54, 147896145, 12000, Departamentos);
            Gerente gerente = new Gerente("Adamastor Neto", "Rua Me Da Nota Alta Por Favor", 47, 78966893, 8000, Funcionarios);
            Analista analista = new Analista("Enzo Gael Pinto", "Rua Florinda", 24, 654563212, 5000);

            listaFuncionarios[0] = diretor;
            listaFuncionarios[1] = gerente;
            listaFuncionarios[2] = analista;

            imprimeRelatorio(listaFuncionarios);
        } catch(DiretorException exDir) {
            System.out.println("Exceção: \n" + exDir);
        } catch(GerenteException exGer) {
            System.out.println("Exceção: \n" + exGer);
        }
    }
    
    public static void imprimeRelatorio(Funcionario[] listaFuncionarios) {
        for(int i = 0; i < listaFuncionarios.length; i++) {
            System.out.printf("\nFuncionário[%d]: %s", i + 1, listaFuncionarios[i].getNome());
            System.out.printf("\nBônus do funcionário[%d]: R$%.2f", i + 1, listaFuncionarios[i].getBonus());
            
            System.out.println("");
        }
    }
    
}
