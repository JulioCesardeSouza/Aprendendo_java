package Exercio05;

import Exercio04.CategoriaEnum;

public class DepartamentoIgreja {
	
	private int idDepartamento;
	private String nome;
	private String inscricao;
	private CategoriaEnum categoriaEnum;
	
	public DepartamentoIgreja(int idDepartamento, String nome, String inscricao, CategoriaEnum categoriaEnum) {
		
		this.idDepartamento = idDepartamento;
		this.nome = nome;
		this.inscricao = inscricao;
		this.categoriaEnum = categoriaEnum;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public CategoriaEnum getCategoriaEnum() {
		return categoriaEnum;
	}

	public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
		this.categoriaEnum = categoriaEnum;
	}
	
	
	

}
