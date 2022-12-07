package Aula13.enuns;

public class TestadorDiasDaSemana1 {

	public static void main(String[] args) {
		
		DiasDaSemana1 domingo = DiasDaSemana1.DOMINGO;

		// nome da variavel final static do ENUM atribuida a uma variavel String
		String segunda = DiasDaSemana1.SEGUNDA_FEIRA.toString();

		int quarta = DiasDaSemana1.QUARTA_FEIRA.ordinal(); // indice do ENUM

		System.out.println("Dia da Semana = " + domingo);
		System.out.println("Dia da Semana = " + segunda);
		System.out.println("Dia da Semana = " + quarta);

	}



	}


