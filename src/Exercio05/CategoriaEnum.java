package Exercio05;

public enum CategoriaEnum {

	MEMBRO("Membro"), COOPERADOR("Cooperador"), DIACONO("Diacono"), PRESBITERO("Presbitero"),
	EVANGELISTA("Evangelista"), PASTOR("Pastor");

	private String categoria;

	CategoriaEnum(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

}
