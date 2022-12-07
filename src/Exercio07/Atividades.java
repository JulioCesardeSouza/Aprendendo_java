package Exercio07;

import java.util.List;

public class Atividades {
	
	private String idAtividade;
	private String materia;
	private String turma;
	private double nota;
	private List<Double>notas;
	
	public Atividades(String idAtividade, String materia, String turma, double nota, List<Double> notas) {
	
		this.idAtividade = idAtividade;
		this.materia = materia;
		this.turma = turma;
		this.nota = nota;
		this.notas = notas;
	}

	public String getIdAtividade() {
		return idAtividade;
	}

	public void setIdAtividade(String idAtividade) {
		this.idAtividade = idAtividade;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	
	

}
