package Exercio04;

public enum CategoriaEnum {

	VENDAS("vendas"), TECNOLOGIA("Tecnologia"), MARKTING("Markting"), FINANCEIRO("Financeiro");



	private String categoria;
	

	CategoriaEnum(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
