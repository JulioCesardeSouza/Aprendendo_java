package Aula13.enuns;

public class TestadorDiasDaSemana2 {

	public static void main(String[] args) {
		
		DiasDaSemana2 domingo = DiasDaSemana2.DOMINGO;

		// nome da variavel final static do enum atribuida a uma variavel String
		String segunda = DiasDaSemana2.SEGUNDA_FEIRA.name();
		// valor numero do construtor do enum
		int quarta = DiasDaSemana2.QUARTA_FEIRA.getNumeroDia();
		// valor por extenso do contrutor
		String sexta = DiasDaSemana2.SEXTA_FEIRA.getDiaPorExtenso();
		System.out.println("Dia da Semana = " + domingo);
		System.out.println("Dia da Semana = " + segunda);
		System.out.println("Dia da Semana = " + quarta);
		System.out.println("Dia da Semana = " + sexta);
		System.out.println("============================");
		for (DiasDaSemana2 dia : DiasDaSemana2.values()) {
			System.out.println("Dia da Semana = " + dia.toString());
			System.out.println("Dia da Semana por extenso = " + DiasDaSemana2.fromString(dia.getDiaPorExtenso().toString()));
		}

	}
}