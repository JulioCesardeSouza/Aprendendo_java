package estudo.aula11.collections;

public class Disciplina {
	
	private int id;
	private String disciplina;
	private String periodo;
	private String nome;
	
	public Disciplina(int id,String disciplina, String nome, String periodo) {
        this.id = id;
		this.disciplina = disciplina;
		this.periodo = periodo;
		this.nome = nome;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	}
	


