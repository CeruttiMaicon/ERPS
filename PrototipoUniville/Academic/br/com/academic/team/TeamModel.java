package br.com.academic.team;

public class TeamModel {
	
	private String nameClass;
	private int SchoolYear;
	private int numberOfStudentsPerClass;
	
	
	public int getNumberOfStudentsPerClass() {
		return numberOfStudentsPerClass;
	}
	public void setNumberOfStudentsPerClass(int numberOfStudentsPerClass) {
		this.numberOfStudentsPerClass = numberOfStudentsPerClass;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public int getSchoolYear() {
		return SchoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		SchoolYear = schoolYear;
	}
	
	

}
