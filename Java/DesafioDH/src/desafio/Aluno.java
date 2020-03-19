package desafio;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codigoAluno;


    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public Aluno(){}

    public Aluno(String nome, String sobrenome, Integer codigoAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;
    }

    public void verificarAluno(Aluno aluno) {
        if (this.codigoAluno == aluno.codigoAluno) {
            this.nome = aluno.nome;
            this.sobrenome = aluno.sobrenome;
        }
    }
}