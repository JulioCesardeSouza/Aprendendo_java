package Exercio05;

 public class  Membresia {
	
	private String nome;
	private String sobreNome;
	private String dataNascimento;
	private boolean batismoNasAguas;
	private int anosDeCrente;
	
	public Membresia() {
		
		
		
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.batismoNasAguas = batismoNasAguas;
		this.anosDeCrente = anosDeCrente;
	}
	public Membresia(String nome, String sobreNome, String dataNascimento, boolean batismoNasAguas, int anosDeCrente) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dataNascimento = dataNascimento;
		this.batismoNasAguas = batismoNasAguas;
		this.anosDeCrente = anosDeCrente;
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public boolean isBatismoNasAguas() {
		return batismoNasAguas;
	}
	public void setBatismoNasAguas(boolean batismoNasAguas) {
		this.batismoNasAguas = batismoNasAguas;
	}
	public int getAnosDeCrente() {
		return anosDeCrente;
	}
	public void setAnosDeCrente(int anosDeCrente) {
		this.anosDeCrente = anosDeCrente;
	}
	

}
