package MetodoAula10;

public class Professor {
	
	private String nome;
	private int idade;
	private boolean leciona;
	
	private Materia materia;	
	
	public Professor() {
	}	
	
	public Professor(Materia materia) {
		this.materia = materia;
	}

	public Professor(String nome, int idade, boolean leciona, Materia materia) {
		this.nome = nome;
		this.idade = idade;
		this.leciona = leciona;
		this.materia = materia;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean isLeciona() {
		return leciona;
	}
	
	public void setLeciona(boolean leciona) {
		this.leciona = leciona;
	}

	public Materia getMateria() {
		return materia;
	}

}
