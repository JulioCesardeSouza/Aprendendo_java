package aula12map;

public class Veiculo {

	private Integer id;
	private Marca marca;
	private String modelo;
	private String cor;

	public Veiculo() {

	}

	public Veiculo(Integer id, Marca marca, String modelo, String cor) {
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

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
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
	return "Veiculo [marca=" + marca.getCodigo() + ", modelo=" + modelo + ", cor=" + cor + "]";
}





}

