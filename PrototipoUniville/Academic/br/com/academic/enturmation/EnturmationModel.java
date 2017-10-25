package br.com.academic.enturmation;

import java.util.Date;

public class EnturmationModel {

	private String curseName;
	private String studentName;
	private Date date;
	private String clerk;

	public String getCurseName() {
		return curseName;
	}

	public void setCurseName(String curseName) {
		this.curseName = curseName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getClerk() {
		return clerk;
	}

	public void setClerk(String clerk) {
		this.clerk = clerk;
	}

	public void insertStudent(){
		EnturmationDAO enturmationDAO = new EnturmationDAO();
			enturmationDAO.updateEnturmation();
	}
}
