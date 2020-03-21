package desafio;

import java.util.ArrayList;


public class DigitalHouseManager {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Matricula> matriculas = new ArrayList<Matricula>();

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public void registrarCurso(String nome, Integer codigoCurso, Integer qtdMaxAlunos){
        Curso cursoNovo = new Curso();
        cursoNovo.setNome(nome);
        cursoNovo.setCodigoCurso(codigoCurso);
        cursoNovo.setQtdMaxAlunos(qtdMaxAlunos);
        this.cursos.add(cursoNovo);
    }

    public void excluirCurso(Integer codigoCurso){
        for (Integer index = 0; index < this.cursos.size(); index++){
            if (this.cursos.get(index).getCodigoCurso() == codigoCurso){
                this.cursos.remove(index);
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer qtdHoras){
        ProfessorAdjunto professor = new ProfessorAdjunto();
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setCodigoProfessor(codigoProfessor);
        professor.setQtdHorasMonitoria(qtdHoras);
        this.professores.add(professor);
    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        ProfessorTitular professor = new ProfessorTitular();
        professor.setNome(nome);
        professor.setSobrenome(sobrenome);
        professor.setCodigoProfessor(codigoProfessor);
        professor.setEspecialidade(especialidade);
        this.professores.add(professor);

    }

    public void excluirProfessor(Integer codigoProfessor){
        for (Integer index = 0; index < this.professores.size(); index++){
            if (this.professores.get(index).getCodigoProfessor() == codigoProfessor){
                this.professores.remove(index);
            }
        }
    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){
        this.alunos.add(new Aluno(nome,sobrenome,codigoAluno));

    }

    public void matricularAlunoCod(Integer codigoAluno, Integer codigoCurso) {
        Integer indexCurso = null;
        Integer indexPretendente = null;
        for (Curso index : this.cursos) {
            if (index.getCodigoCurso().equals(codigoCurso)) {
                indexCurso = this.cursos.indexOf(index);
            }

        }
        for (Aluno pretendente : this.alunos) {
            if (pretendente.getCodigoAluno().equals(codigoAluno)) {
                indexPretendente = this.alunos.indexOf(pretendente);
            }
        }
        if (indexPretendente == null || indexCurso == null) {
            System.out.println("Não é possível continuar a matrícula. Códigos inseridos não foram localizados");
        } else {
            Aluno aluno = this.alunos.get(indexPretendente);
            Curso curso = this.cursos.get(indexCurso);
            if (curso.adicionarUmAluno(aluno) == false) {
                System.out.println("Não foi possível matricular, vagas cheias");
            } else {
                Matricula novaMatricula = new Matricula(aluno, curso);
                this.matriculas.add(novaMatricula);
                System.out.println("Meus Parabéns, você foi cadastrado");
            }

        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        for (int i = 0; i < this.cursos.size() ; i++) {
            Curso cursoDesejado = this.cursos.get(i);
            if (cursoDesejado.getCodigoCurso().equals(codigoCurso)){
                for (int j = 0; j < this.professores.size() ; j++) {
                    Professor professorCandidato = this.professores.get(j);
                    if (professorCandidato.getCodigoProfessor().equals(codigoProfessorTitular)){
                        ProfessorTitular profAlocado = (ProfessorTitular) professorCandidato;
                        this.cursos.get(i).setProfessorTitular(profAlocado);
                        }
                    else if (professorCandidato.getCodigoProfessor().equals(codigoProfessorAdjunto)){
                        ProfessorAdjunto profAlocado = (ProfessorAdjunto) professorCandidato;
                        this.cursos.get(i).setProfessorAdjunto(profAlocado);

                    }
                }



                }
        }

    }


}

