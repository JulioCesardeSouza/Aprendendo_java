package heranca;

public class Professor extends Pessoa{
	
	
	private String departamento;
	private String nomeCurso;
	private double salario;
	
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
	
}
