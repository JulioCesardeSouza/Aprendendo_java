package Exercio04;

public enum StatusFuncionarioEnum {

	ATIVO("Ativo"), BLOQUEADO("Bloqueado");

	private String statusDoFuncionario;

	StatusFuncionarioEnum(String statusDoFuncionario) {
		this.statusDoFuncionario = statusDoFuncionario;
	}

	public String getStatusDoFuncionario() {
		return statusDoFuncionario;
	}

}
