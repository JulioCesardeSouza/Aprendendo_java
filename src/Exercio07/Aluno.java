package Exercio07;

public class Aluno {
	
	
	private String idAlunoProjeto;
	private String escola;
	private String nome;
	private String sobreNome;
	private int idade;
	
	public Aluno() {
		
	}
	public Aluno(String idAlunoProjeto, String escola, String nome, String sobreNome, int idade) {
		
		this.idAlunoProjeto = idAlunoProjeto;
		this.escola = escola;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
	}
	public String getIdAlunoProjeto() {
		return idAlunoProjeto;
	}
	public void setIdAlunoProjeto(String idAlunoProjeto) {
		this.idAlunoProjeto = idAlunoProjeto;
	}
	public String getEscola() {
		return escola;
	}
	public void setEscola(String escola) {
		this.escola = escola;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	

}
