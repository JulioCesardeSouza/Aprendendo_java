package Exercio05;

public class Igreja {
	
	private int idIgreja;
	private String nome;
	private String incricao;
	
	
	public Igreja(int idIgreja, String nome, String incricao) {
		super();
		this.idIgreja = idIgreja;
		this.nome = nome;
		this.incricao = incricao;
	}


	public Igreja() {
	
		this.idIgreja = idIgreja;
		this.nome = nome;
		this.incricao = incricao;
		
		
	}


	public int getIdIgreja() {
		return idIgreja;
	}


	public void setIdIgreja(int idIgreja) {
		this.idIgreja = idIgreja;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getIncricao() {
		return incricao;
	}


	public void setIncricao(String incricao) {
		this.incricao = incricao;
	}
	

}