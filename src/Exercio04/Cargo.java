package Exercio04;

public class Cargo {

	private int idCargo;
	private String nome;
	private String descricao;
	private FaixaSalarialMensal faixaSalarialMensal;

	public Cargo(int idCargo, String nome, String descricao) {

		this.idCargo = idCargo;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Cargo(int idCargo, String nome, String descricao, FaixaSalarialMensal faixaSalarialMensal) {

		this.idCargo = idCargo;
		this.nome = nome;
		this.descricao = descricao;
		this.faixaSalarialMensal = faixaSalarialMensal;
	}

	public Cargo(FaixaSalarialMensal faixaSalarialMensal) {

		this.faixaSalarialMensal = faixaSalarialMensal;
	}

	public int getIdCargo() {
		return idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	};

	public FaixaSalarialMensal getFaixaSalarialMensal() {
		return faixaSalarialMensal;
	}

	public void setFaixaSalarialMensal(FaixaSalarialMensal faixaSalarialMensal ) {
		this.faixaSalarialMensal = faixaSalarialMensal;
	}

}
