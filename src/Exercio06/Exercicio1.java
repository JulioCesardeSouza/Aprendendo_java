package Exercio06;
import java.util.*;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<Integer> inteiros = new ArrayList<>();
		for(int i =0; i < 3;i++) {
			System.out.println("Insira o valor na lista");
			int valor = ler.nextInt();
			inteiros.add(valor);
		}
		int valorTotal = somaTotalDaLista(inteiros);
		System.out.println("A soma do valor total é "+ valorTotal);

	}
	
	public static int somaTotalDaLista(List<Integer> lista) {
		int valorTotal=0;
		for(Integer valor : lista) {
			valorTotal += valor;
		}
		return valorTotal;
	}

}
