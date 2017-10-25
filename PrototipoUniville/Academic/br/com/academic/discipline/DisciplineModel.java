package br.com.academic.discipline;

public class DisciplineModel {
	
	private String disciplineName;
	private int workload;
	private String responsibleDiscipline;
	
	//Default get e set'rs
	public String getDisciplineName() {
		return disciplineName;
	}
	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}
	public int getWorkload() {
		return workload;
	}
	public void setWorkload(int workload) {
		this.workload = workload;
	}
	public String getResponsibleDiscipline() {
		return responsibleDiscipline;
	}
	public void setResponsibleDiscipline(String responsibleDiscipline) {
		this.responsibleDiscipline = responsibleDiscipline;
	}
	
	

}
