package t08e03;

public class Professor extends Pessoa {
    private Disciplina[] disciplinasMinistradas;
    private int quantidade = 0;
    
    public Professor(String nome, int idade, String endereco, int quantidadeDisciplinasMinistradas) {
        super(nome, idade, endereco);
        this.setQuantidadeDisciplinasMatriculadas(quantidadeDisciplinasMinistradas);
    }
    
    public String getNome() {
        return super.getNome();
    }
    
    public int getquantidadeDisciplinasMatriculadas() {
        return this.quantidade;
    }
    
    public void setQuantidadeDisciplinasMatriculadas(int quantidadeDisciplinasMinistradas) {
        this.disciplinasMinistradas = new Disciplina[quantidadeDisciplinasMinistradas];
    }
    
    public String fazMatricula(Disciplina disciplina) {
        String informe;
        
        if (this.disciplinasMinistradas.length == 0) {
            informe = "\nEste professor não pode ser relacionado a nenhuma disciplina, por favor, fale com a secretaria.\n\n";
            return informe;
        }
        
        if (this.quantidade >= this.disciplinasMinistradas.length) {
            informe = "\nQuantidade de disciplinas excedida.\nO limite de disciplinas para este professor é de " 
                    + disciplinasMinistradas.length 
                    + " disciplina(s).\nSe desejar, cancele a matrícula de uma das disciplinas e faça a nova matrícula.\n\n";
            return informe;
        }
        
        this.disciplinasMinistradas[this.quantidade] = disciplina;
        this.quantidade++;
        
        informe = "\nMatrícula na disciplina " + disciplina.getNome() + " executada.\n\n";
        return informe;
    }
}
