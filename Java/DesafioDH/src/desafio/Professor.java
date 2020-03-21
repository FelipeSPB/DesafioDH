package desafio;

public abstract class Professor {

    private String nome;
    private String sobrenome;
    private Integer tempoCasa;
    private Integer codigoProfessor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(Integer tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public Integer getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(Integer codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }


    public void verificarProfessor(Professor professor) {
        if (this.codigoProfessor == professor.codigoProfessor) {
            this.nome = professor.nome;
            this.sobrenome = professor.sobrenome;
            this.tempoCasa = professor.tempoCasa;

        }
    }


}
