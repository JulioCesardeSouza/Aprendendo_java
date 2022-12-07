package MetodoAula10;

public class ExecutarAplicacao {
	



	public static void main(String[] args) {
		ClasseMetodo classeMetodo = new ClasseMetodo();
        
		classeMetodo.metodoPublico();
		classeMetodo.metodoPublicoSemRetornoComParametro(5, 3);
		classeMetodo.metodoPublicoSemRetornoComParametroString("Huelton", "Santos", 37);
		String mensagem = classeMetodo.metodoPublicoComRetornoString();
		
		System.out.println(mensagem);
		
		String aprendendoJava = classeMetodo.metodoPublicoComRetornoStringComParametro("Aprendendo Java");
		System.out.println(aprendendoJava);
		
		boolean valor = classeMetodo.metodoPublicoComRetornoBooleanComParametro(8, 8);
		System.out.println(valor);
		
		Materia materia = new Materia();
		materia.setNome("Java");
		materia.setPeriodo("Noturno");
		materia.setSerie("1A");
		
		Professor professor = new Professor(materia);
		professor.setNome("Huelton");
		professor.setIdade(18);
		professor.setLeciona(true);
		
		classeMetodo.visualizarDadosProfessor(professor);
		
	}

}
