package Exercio04;

public class Funcionario {

	private int idFuncionario;
	private String nome;
	private String sobreNome;
	private String dataNascimento;
	private boolean temCarteiraTrabalho;
	private int anosExp;
	private double salarioBruto;
	private Cargo cargo;
	private Departamento departamento;
	private StatusFuncionarioEnum statusFuncionarioEnum;

	public Funcionario() {
		
	}
	

	public Funcionario(int idFuncionario, String nome, String sobreNome, String dataNascimento,
			boolean temCarteiraTrabalho, int anosExp, double salarioBruto) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.temCarteiraTrabalho = temCarteiraTrabalho;
		this.anosExp = anosExp;
		this.salarioBruto = salarioBruto;
	}


	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
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

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public boolean isTemCarteiraTrabalho() {
		return temCarteiraTrabalho;
	}

	public void setTemCarteiraTrabalho(boolean temCarteiraTrabalho) {
		this.temCarteiraTrabalho = temCarteiraTrabalho;
	}

	public int getAnosExp() {
		return anosExp;
	}

	public void setAnosExp(int anosExp) {
		this.anosExp = anosExp;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public StatusFuncionarioEnum getStatusFuncionarioEnum() {
		return statusFuncionarioEnum;
	}

	public void setStatusFuncionarioEnum(StatusFuncionarioEnum statusFuncionarioEnum) {
		this.statusFuncionarioEnum = statusFuncionarioEnum;
	}

}
