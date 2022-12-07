package Exercio07;

import java.util.List;

public class Notas {
	
	private String sala;
	private String materia;
	private double idNota;
	private List<Aluno>alunos;
	private List<Professor>professores;
	private List<Double>notas;
	
	public Notas(String sala, String materia, double idNota, List<Aluno> alunos, List<Professor> professores,
			List<Double> notas) {
		
		this.sala = sala;
		this.materia = materia;
		this.idNota = idNota;
		this.alunos = alunos;
		this.professores = professores;
		this.notas = notas;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getIdNota() {
		return idNota;
	}

	public void setIdNota(double idNota) {
		this.idNota = idNota;
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

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	
	
	

}
