package br.com.academic.teacher;

public class TeacherDAO {
	
	public String registeredTeacher(){
		String SELECTcomOsProfessoresCadastrados = "SELECT com professores cadastrados";
		System.out.println(SELECTcomOsProfessoresCadastrados);
		return SELECTcomOsProfessoresCadastrados;
	}

}
