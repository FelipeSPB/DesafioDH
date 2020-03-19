package desafio;

import desafio.DigitalHouseManager;
import desafio.Professor;
import desafio.ProfessorTitular;
import desafio.Matricula;

public class Main {
    public static void main(String[] args) {
        DigitalHouseManager run = new DigitalHouseManager();
        run.registrarProfessorTitular("Hatake","Kakashi",1,"Jutsu Programming");
        run.registrarProfessorAdjunto("Gai","Maito",2,6);
        run.registrarProfessorAdjunto("Alphonse","Elric",3,12);
        run.registrarProfessorTitular("Edward","Elric",4,"Alchemy Code");
        run.registrarCurso("Full Stack",20001,3);
        run.registrarCurso("Android",20002,2);
        run.alocarProfessores(20001,1,2);
        run.alocarProfessores(20002,4,3);
        run.matricularAluno("Naruto","Uzumaki",1);
        run.matricularAluno("Rock","Lee",2);
        run.matricularAluno("Natsu","Dragneel",3);
        run.matricularAluno("Grey","Fullbuster",4);
        run.matricularAluno("Lucy","Heartfilia",5);
        run.matricularAlunoCod(1,20001);
        run.matricularAlunoCod(2,20002);
        run.matricularAlunoCod(3,20003);
        run.matricularAlunoCod(4,20002);
        run.matricularAlunoCod(5,20002);

    }



}
