package ExercicioMap;

import java.util.List;

public class Veiculo {
	
	
	private String nome;
	private String montadora;
	private String anoFabricacao;
	private List<String>listaDeNomesVeiculos;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String nome, String montadora, String anoFabricacao, List<String> listaDeNomesVeiculos) {
		
		this.nome = nome;
		this.montadora = montadora;
		this.anoFabricacao = anoFabricacao;
		this.listaDeNomesVeiculos = listaDeNomesVeiculos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public List<String> getListaDeNomesVeiculos() {
		return listaDeNomesVeiculos;
	}

	public void setListaDeNomesVeiculos(List<String> listaDeNomesVeiculos) {
		this.listaDeNomesVeiculos = listaDeNomesVeiculos;
	}
	
	

}
