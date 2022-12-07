package Exercio07;

import java.util.List;

public class Professor {
	
	private String nome;
	private String sobreNome;
	private String idProfessor;
	private String descricao;
	private String registroMec;
	private List<Materia>materia;
	private PeriodoEnum periodo;
	
	public Professor() {
		
	}
	public Professor(String nome, String sobreNome, String idProfessor, String descricao, String registroMec,
			List<Materia> materia,PeriodoEnum periodo) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idProfessor = idProfessor;
		this.descricao = descricao;
		this.registroMec = registroMec;
		this.materia = materia;
		this.periodo = periodo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(String idProfessor) {
		this.idProfessor = idProfessor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getRegistroMec() {
		return registroMec;
	}
	public void setRegistroMec(String registroMec) {
		this.registroMec = registroMec;
	}
	public List<Materia> getMateria() {
		return materia;
	}
	public void setMateria(List<Materia> materia) {
		this.materia = materia;
	}
	public PeriodoEnum getPeriodo() {
		return periodo;
		
	}
	public void setPeriodo(PeriodoEnum periodo) {
		this.periodo = periodo;
	}
	
	
	
	

}
