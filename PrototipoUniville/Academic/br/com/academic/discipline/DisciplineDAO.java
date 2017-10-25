package br.com.academic.discipline;

public class DisciplineDAO {
	
	public void insertDiscipline(){
		System.out.println("INSERT da disciplina no banco de dados");
	}
	
	public void insertDisciplineDidNotWork(){
		System.out.println("A disciplina não pode ser cadastrada pois já existe");
	}

}
