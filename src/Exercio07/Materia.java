package Exercio07;

public class Materia {
	
	private String nome;
	private String sobreNome;
	private String idMateria;
	private String descricao;
	
	public Materia() {
		
	}
	public Materia(String nome, String sobreNome, String idMateria, String descricao) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idMateria = idMateria;
		this.descricao = descricao;
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
	public String getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(String idMateria) {
		this.idMateria = idMateria;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
