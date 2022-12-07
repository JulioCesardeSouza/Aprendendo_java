package ExercicioMap;

import aula12map.Marca;

public class Veiculo2 {

	private Integer id;
	private String marca;
	private String modelo;
	private String cor;

	public Veiculo2() {

	}

	public Veiculo2(Integer id, String marca, String modelo, String cor) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}



@Override
public String toString() {
	return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + "]";
}





}

