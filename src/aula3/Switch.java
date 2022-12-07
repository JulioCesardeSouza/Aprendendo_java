package aula3;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("entre com a primeira nota");
		double nota1 = ler.nextDouble();
		System.out.println("entre com a segunda nota");
		double nota2 = ler.nextDouble();
		System.out.println("entre com a terceira nota");
		double nota3 = ler.nextDouble();
		System.out.println("entre com a quarta nota");
		double nota4 = ler.nextDouble();
		
		System.out.println("frequência:");
		double frequencia = ler.nextDouble();
        String nota = ler.next();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
      
       
       
       
		System.out.printf("O calculo da notas: %.2f \n", (nota1 + nota2 + nota3 + nota4 ));
		System.out.println(media);
		
		// media=nota1+nota2+nota3+nota4;
		
		

				if (media > 7.0 && media <= 10.0) {
					
					if (frequencia >= 0.5 && frequencia <= 0.7) {
						System.out.println("Aluno de recuperaçao porque teve frequencia baixa ");

					} else if (frequencia < 0.5 ) {
						System.out.println("Aluno reprovado poque nao atingiu a frequencia necessaria");
						
					} else {
						System.out.println("Aluno aprovado porque teve uma boa frequencia ");

					}

				} else if (media >= 5.0 && media <= 7.0) {
					if (frequencia > 0.7) {
						System.out.println("Aluno de recuperaçao mas teve uma boa frequencia");

					} else if (frequencia < 0.5 ) {
						System.out.println("Aluno reprovado poque nao atingiu a frequencia necessaria");
						
					} else {
						System.out.println("Aluno de recuperaçao e teve uma frequencia baixa ");

					}
				} else if (media < 5.0) {
					if (frequencia > 0.7) {
						System.out.println("Aluno de recuperaçao mas teve uma boa frequencia");

					} else if (frequencia < 0.5 ) {
						System.out.println("Aluno reprovado poque nao atingiu a frequencia necessaria");
						
					} else {
						System.out.println("Aluno de recuperaçao e teve uma frequencia baixa ");

					}

				} else if (media > 7.0 && media <= 10.0){
					System.out.println("A nota deve ter o valor de A ");
					
					
				}else if (media>5.0 && media <= 7.0) {
					System.out.println("A nota deve ter o valor de B ");
					
				}else if (media > 3.0 && media <= 5.0) {
					System.out.println("A nota deve ter o valor de C ");
					
				}else if (media >0.0 && media <= 3.0) {
					System.out.println("A nota deve ter o valor de D ou senao E");
					
					
					
				} if(frequencia >0.7 ) {
					System.out.printf(" Aluno passou com nota %s.2f porcento",nota,frequencia);
					
				}else if (frequencia>0.5 && frequencia <= 0.7) {
					System.out.printf("Aluno passou com nota %s e teve uam frequencia de %s.2f porcento",nota,frequencia);
					
					}else {
						System.out.printf("Aluno de recuperaçao com nota %s e teve uma frequencia ruim de %.2f porcento",nota,frequencia);
		}
						
		
		
	
	switch (nota) {
	case "9":
	case "8":System.out.println("Aluno passou");break;
	case "6":System.out.println("Aluno de recuperaçao");break;default:
	case "5":System.out.println("aluno reprovado");break;
		}
			
		}

}	
	

	
						
				

	





          
          


		
		
	


