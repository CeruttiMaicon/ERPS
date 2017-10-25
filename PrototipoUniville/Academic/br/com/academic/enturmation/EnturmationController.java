package br.com.academic.enturmation;

import br.com.academic.student.StudentModel;
import br.com.academic.team.TeamModel;

public class EnturmationController {

	public boolean limitOfStudentsPerTeam(TeamModel team) {

		// valida se a turma tem até 30 alunos
		if (team.getNumberOfStudentsPerClass() < 30) {
			return true;
		} else {
			return false;
		}
	}

	public boolean libraryDependency(StudentModel student) {
		// valida se o estudante tem dependencias financeiras com a biblioteca
		if (student.getLibrary() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void insertStudentEnturmation(EnturmationController enturmationcontroller, StudentModel student, TeamModel team) {
		
		if(enturmationcontroller.libraryDependency(student) && enturmationcontroller.limitOfStudentsPerTeam(team)){
			EnturmationDAO enturma = new EnturmationDAO();
			enturma.updateEnturmation();
		}else{
			System.out.println("O aluno não pode ser adicionado");
		}

	}
}
