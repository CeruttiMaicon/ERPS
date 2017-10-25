package br.com.academic.student;

public class StudentModel {
	
	private int ID;
	private String name;
	private String adress;
	private int CPF;
	private int RG;
	private int telephone;
	private int schoolYear;
	private float library;
	private String responsible;
	
	
	
	
	
	
	public StudentModel(String name, String adress, int cPF, int rG, int telephone, int schoolYear ) {
		super();
		this.name = name;
		this.adress = adress;
		CPF = cPF;
		RG = rG;
		this.telephone = telephone;
		this.schoolYear = schoolYear;
		//Por padrão o aluno não terá pendencia na biblioteca
		this.library = 0;
	}
	//Geters e Seters Default
	public float getLibrary() {
		return library;
	}
	public void setLibrary(float library) {
		this.library = library;
	}
	
	public int getSchoolYear() {
		return schoolYear;
	}
	public void setSchoolYear(int schoolYear) {
		this.schoolYear = schoolYear;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getRG() {
		return RG;
	}
	public void setRG(int rG) {
		RG = rG;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getResponsible() {
		return responsible;
	}
	public void setResponsible(String responsible) {
		this.responsible = responsible;
	}
	///////////////////////////////////////////
	
	public void createStudent(){
		StudentDAO studentDAO = new StudentDAO();
			studentDAO.create();		
	}
	

}
