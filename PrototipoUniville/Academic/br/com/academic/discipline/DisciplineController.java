package br.com.academic.discipline;

import br.com.academic.teacher.TeacherDAO;

public class DisciplineController {
	
	
	
	public void validateTeacher(DisciplineModel discipline){
		
		
		TeacherDAO cadastrado = new TeacherDAO();
		if(discipline.getDisciplineName() == cadastrado.registeredTeacher() ){
			DisciplineDAO cadastro = new DisciplineDAO();
			cadastro.insertDiscipline();
		}else{
			DisciplineDAO cadastro = new DisciplineDAO();
			cadastro.insertDisciplineDidNotWork();
		}
	}
	
	

	

}
