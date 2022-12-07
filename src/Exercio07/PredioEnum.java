package Exercio07;

import java.util.List;

public enum PredioEnum {
	
	
	BLOCO_A,BLOCO_B,BLOCO_C;
	
	private String idTurma;
	private String sala;
	private List<Aluno>aluno;
	public String getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(String idTurma) {
		this.idTurma = idTurma;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}
	
	
	
	
	
	}
	
	
	


