package MetodoAula10;

public class ClasseMetodo {
	
	public void metodoPublico() {
		int x = 5;
		int y = 10;
		
		System.out.println("O metodo é executado como publico");
		System.out.println("Soma de x e y = "+ (x+y));
	}
	
	public void metodoPublicoSemRetornoComParametro(int x, int y) {
		System.out.println("Soma de x e y = "+ (x+y));
	}
	
	public void metodoPublicoSemRetornoComParametroString(String nome, String sobreNome, int idade) {
		int idadeDaqui5anos = idade + 5;
		System.out.println("Nome completo: "+ nome + " "+ sobreNome + " com idade daqui 5 anos: "+ idadeDaqui5anos);
	}	
	
	public String metodoPublicoComRetornoString() {
		String mensagem = "Boa noite pastor";		
		return mensagem;
	}
	
	public String metodoPublicoComRetornoStringComParametro(String mensagem) {
		String resposta = mensagem;		
		return resposta;
	}
	
	public boolean metodoPublicoComRetornoBooleanComParametro(int x, int y) {
		boolean valor = x < y;		
		return valor;
	}
	
	public double metodoPublicoComRetornoDoubleComParametro(double x, double y) {
		return x + y;
	}
	
	public void visualizarDadosProfessor(Professor prof) {
		 System.out.println("Nome do professor: "+ prof.getNome());
		 System.out.println("Idade do professor: "+ prof.getIdade());
		 System.out.println("O professor da aula?: "+ prof.isLeciona());
		 System.out.println("Materia que o professor da aula: "+ prof.getMateria().getNome());
		 System.out.println("Periodo da Materia: "+ prof.getMateria().getPeriodo());
		 System.out.println("Serie da Materia: "+ prof.getMateria().getSerie());
	}
	
	/*public String validaSePessoaHabilitada(Professor p) {
		
		if(p.getIdade() >= 18 && p.isHabilitada()) {
			return "Habilitado";
		} else {
			return "Não Habilitado";
		}	
	
	} */

}
