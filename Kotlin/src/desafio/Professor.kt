package desafio

class Professor (private var nome: String, private var sobrenome:String, private var tempoCasa: Integer, private val codigoProfessor: Integer) {
    fun  verificarAluno(professor: Professor) {
        if(this.codigoProfessor == professor.codigoProfessor) {
            this.nome = professor.nome;
            this.sobrenome = professor.sobrenome;
            this.tempoCasa = professor.tempoCasa;
        }
    }
}