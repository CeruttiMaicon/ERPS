package br.com.academic.course;

import java.util.List;

public class CourseModel {
	
	private String nomeCurse;
	private String responsibleTeacher;
	private List<?> teachersResponsible;
	
	//getrs e seters
	public String getNomeCurse() {
		return nomeCurse;
	}
	public void setNomeCurse(String nomeCurse) {
		this.nomeCurse = nomeCurse;
	}
	public String getResponsibleTeacher() {
		return responsibleTeacher;
	}
	public void setResponsibleTeacher(String responsibleTeacher) {
		this.responsibleTeacher = responsibleTeacher;
	}
	public List<?> getTeachersResponsible() {
		return teachersResponsible;
	}
	public void setTeachersResponsible(List<?> teachersResponsible) {
		this.teachersResponsible = teachersResponsible;
	}

}
