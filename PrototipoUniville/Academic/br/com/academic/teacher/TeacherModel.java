package br.com.academic.teacher;

public class TeacherModel extends br.com.academic.student.StudentModel {
	
	public TeacherModel(String name, String adress, int cPF, int rG, int telephone, int schoolYear) {
		super(name, adress, cPF, rG, telephone, schoolYear);
		// TODO Auto-generated constructor stub
	}

	private String ResponsibleDiscipline;
	
	
	//Geters e Seters Default
	public String getResponsibleDiscipline() {
		return ResponsibleDiscipline;
	}

	public void setResponsibleDiscipline(String responsibleDiscipline) {
		ResponsibleDiscipline = responsibleDiscipline;
	}

}
