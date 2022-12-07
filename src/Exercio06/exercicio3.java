package Exercio06;

import java.util.*;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();
		Funcionario func;
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome do funcionario");
			String nome = ler.next();
			System.out.println("Digite o sobre nome do funcionario");
            String sobreNome = ler.next();
			System.out.println("Digite o salario bruto");
			double salarioBruto = ler.nextDouble();
			func = new Funcionario(nome, sobreNome, salarioBruto);
			funcionarios.add(func);

		}
		
		buscaSalarioBrutoMaior(funcionarios);

	}
	
	public static void buscaSalarioBrutoMaior(List<Funcionario>funcionarios) {
		double maiorValor = 0.0;
		String nome = null, sobreNome = null;
		for(int i =0; i < funcionarios.size();i++) {
			Funcionario funcionario = funcionarios.get(i); 
			if(funcionario.getSalarioBruto() > maiorValor) {
				maiorValor = funcionario.getSalarioBruto();
				 nome = funcionario.getNome();
				 sobreNome = funcionario.getSobreNome();
			}
			
		}
		System.out.println("O maior salario bruto "+ maiorValor +" " + nome + " " + sobreNome);
	}

}
