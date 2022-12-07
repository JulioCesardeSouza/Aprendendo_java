package Exercio05;

public enum StatusDoMembro {
	
	
	ATIVO("Ativo"), BLOQUEADO("Bloqueado");

	private String statusDoMembro;

	StatusDoMembro(String statusDoMembro) {
		this.statusDoMembro = statusDoMembro;
	}

	public String getStatusDoMembro() {
		return statusDoMembro;
	}

	

}
