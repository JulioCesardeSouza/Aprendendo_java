package Exercio02;

import java.util.Scanner;

public class Condutor {

	private String nome, sobreNome, tipoHabilitacao;
	private Endereco endereco;
	private int idade;
	private boolean possuiHabilitacao = true;

	public Condutor(String nome, String sobreNome, String tipoHabilitacao, Endereco endereco, int idade,
			boolean possuiHabilitacao) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.tipoHabilitacao = tipoHabilitacao;
		this.endereco = endereco;
		this.idade = idade;
		this.possuiHabilitacao = possuiHabilitacao;
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

	public String getTipoHabilitacao() {
		return tipoHabilitacao;
	}

	public void setTipoHabilitacao(String tipoHabilitacao) {
		this.tipoHabilitacao = tipoHabilitacao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isPossuiHabilitacao() {
		return possuiHabilitacao;
	}

	public void setPossuiHabilitacao(boolean possuiHabilitacao) {
		this.possuiHabilitacao = possuiHabilitacao;
	}

}
