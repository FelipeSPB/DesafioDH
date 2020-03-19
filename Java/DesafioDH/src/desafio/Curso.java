package desafio;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private int qtdMaxAlunos;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public void verificarCurso(Curso curso) {
        if (this.codigoCurso == curso.codigoCurso) {
            this.nome = curso.nome;
        }
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQtdMaxAlunos() {
        return qtdMaxAlunos;
    }

    public void setQtdMaxAlunos(Integer qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public boolean adicionarUmAluno(Aluno umAluno){
        if (this.qtdMaxAlunos > this.alunos.size()){
            this.alunos.add(umAluno);
            return true;
        }else{
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        for (Aluno index: this.alunos){
            if (index == umAluno){
                this.alunos.remove(index);
            }
        }
    }

}
