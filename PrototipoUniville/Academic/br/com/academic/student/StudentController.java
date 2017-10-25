package br.com.academic.student;

public class StudentController {
	
	public void validadeStudentName(StudentModel student){
		
		
		student.createStudent();
		
	}
	
	public void personInCharge(StudentModel student){
		
		student.getResponsible();
	}
	
	public void requestStudentEnrollmentID(StudentModel student){
		if(student.getID()!=0){
			StudentDAO consultanota = new StudentDAO();
			consultanota.consulteNotes();
		}
	}
	
	
	public void startProof(){
		
		ProofDAO studentDAO = new ProofDAO();
		studentDAO.startProof();
	}
	
	
	
	
	public void finalizeProof(StudentModel student){
		ProofDAO studentDAO = new ProofDAO();
		studentDAO.finalizeProof();
	}
	
	public void compareResults(){
		
	}

}
