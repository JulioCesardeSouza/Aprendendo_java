package aula3;

import java.util.Scanner;

public class IfElseEncadeado {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("entre com a primeira nota:");
		double nota1 = ler.nextDouble();
		System.out.println("entre com a segunda nota:");
		double nota2 = ler.nextDouble();
		System.out.println("entre com a terceira nota:");
		double nota3 = ler.nextDouble();
		System.out.println("entre com a quarta nota:");
		double nota4 = ler.nextDouble();
		System.out.println("frequência:");
		double frequencia = ler.nextDouble();

		double media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("O calculo da notas: %.2f \n", (nota1 + nota2 + nota3 + nota4 ));
		System.out.println(media);

		String aproveitamento = "";

		if (media > 7.0 && media <= 10.0) {
			aproveitamento = "A"; 
  
			} else if ( media > 5.0 && media<= 7.0 ) {
			aproveitamento = "B";	
			} else if (media > 3.0 && media <= 5){
			aproveitamento = "C";	
			} else if (media > 0.0 && media <= 3.0) {
			 aproveitamento = "D";	
			} else {
				aproveitamento = "E";
			}
		
				
				
				switch(aproveitamento) {
				case "A":
					System.out.println("entre com a frequencia ");
					if(frequencia >7.0 && frequencia <= 10.0) {
						System.out.printf("aluno passou com nota %s e teve uma otima frequencia de %.2f porcento",aproveitamento,frequencia);
					} else if (frequencia > 0.5 && frequencia <= 0.7) {
						System.out.printf("aluno passou com nota %s e teve uma otima frequencia de %.2f porcento",aproveitamento,frequencia);
		
					}else {
						System.out.printf("Aluno de recuperacao com nota %s e teve uma frequencia ruim de %.2f porcento", aproveitamento, frequencia);break;
					}
					
				case "B":
					System.out.println("entre com a frequencia ");
				if(frequencia > 0.5 && frequencia <= 0.7) {
					System.out.printf("aluno passou com nota %s e teve uma boa frequencia de %.2f porcento",aproveitamento,frequencia);
				}else if (frequencia > 0.5 && frequencia <= 0.7) {
					System.out.printf ("aluno passou com nota %s e teve uma boa frequencia de %.2f porcento",aproveitamento,frequencia); 
				}else {
					
					System.out.printf("Aluno de recuperacao com nota %s e teve uma frequencia ruim de %.2f porcento", aproveitamento, frequencia);break;
				}
				case "C":
					System.out.println("entre com a frequencia ");
					if(frequencia > 0.5 && frequencia <= 0.7) {
						System.out.printf("aluno passou com nota %s e teve uma razoavel frequencia de %.2f porcento",aproveitamento,frequencia);
					}else if (frequencia > 0.5 && frequencia <= 0.7) {
						System.out.printf ("aluno passou com nota %s e teve uma boa frequencia de %.2f porcento",aproveitamento,frequencia); break;
					}else {
						
						System.out.printf("Aluno de recuperacao com nota %s e teve uma frequencia ruim de %.2f porcento", aproveitamento, frequencia);break;
					}
				case "D":
					System.out.println("entre com a frequencia ");
					if(frequencia > 0.5 && frequencia <= 0.7) {
						System.out.printf("aluno reprovado com nota %s e teve uma boa frequencia de %.2f porcento",aproveitamento,frequencia);
					}else if (frequencia > 0.5 && frequencia <= 0.7) {
						System.out.printf ("aluno passou com nota %s e teve uma boa frequencia de %.2f porcento",aproveitamento,frequencia); 
					}else {
						System.out.printf("Aluno reprovado com nota %s e teve uma frequencia ruim de %.2f porcento", aproveitamento, frequencia);break;
					}
					
				default: 
					System.out.println("aluno com nota invalida não foi possivel fazer a validação da frequencia");
				
					
				}
			}
}


