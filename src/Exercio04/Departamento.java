package Exercio04;

public class Departamento {

	private int idDepartamento;
	private String nome;
	private String descricao;
	private CategoriaEnum categoriaEnum;
	private Funcionario supervisor;

	public Departamento() {
	}

	public Departamento(int idDepartamento, String nome, String descricao, CategoriaEnum categoriaEnum) {
		super();
		this.idDepartamento = idDepartamento;
		this.nome = nome;
		this.descricao = descricao;
		this.categoriaEnum = categoriaEnum;

	}

	public Departamento(int idDepartamento, String nome, String descricao) {
		super();
		this.idDepartamento = idDepartamento;
		this.nome = nome;
		this.descricao = descricao;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public CategoriaEnum getCategoriaEnum() {
		return categoriaEnum;
	}

	public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
		this.categoriaEnum = categoriaEnum;
	}

	public Funcionario getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Funcionario supervisor) {
		this.supervisor = supervisor;
	}

}
