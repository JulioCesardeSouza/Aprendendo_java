package Exercio07;

import java.util.List;

public class Turma {
	
	private String idturma;
	private String sala;
	private int numero;
	private List<Aluno>alunos;
	private List<Professor>professores;
	
	public Turma(String idturma, String sala, int numero, List<Aluno> alunos, List<Professor> professores) {
		
		this.idturma = idturma;
		this.sala = sala;
		this.numero = numero;
		this.alunos = alunos;
		this.professores = professores;
	}

	public String getIdturma() {
		return idturma;
	}

	public void setIdturma(String idturma) {
		this.idturma = idturma;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	
	
	
	

}
