package Exercio06;

public class Funcionario {

	private String nome;
	private String sobreNome;
	private double salarioBruto;

	public Funcionario() {

	}

	public Funcionario(String nome, String sobreNome, double salarioBruto) {

		this.nome = nome;
		this.sobreNome = sobreNome;
		this.salarioBruto = salarioBruto;
		
		
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

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	

}
