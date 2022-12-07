package ExercicioMap2;

import java.util.*;
import java.util.Map.Entry;

import ExercicioMap.Veiculo2;

public class Execucao2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Map<Integer, Pedido> mapPedido = new HashMap<>();
		List<ItensProduto> listaItensProduto = new ArrayList<>();

		System.out.println("Insira a quantidade de Usuario no Sistema ");
		Integer qtdUsuario = ler.nextInt();

		for (int i = 0; i < qtdUsuario; i++) {
			System.out.println("Insira o nome do Usuario ");
			String nome = ler.next();
			System.out.println("Insira a idade do Usuario");
			int idade = ler.nextInt();
			Usuario usuario = new Usuario(i + 1, nome, idade);

			System.out.println("Insira a quantidade de Itens produtos para o pedido");
			Integer qtdItens = ler.nextInt();
			for (int j = 0; j < qtdItens; j++) {
				System.out.println("Insira o nome do produto");
				String nomeProduto = ler.next();
				System.out.println("Insira o valor do produto");
				double valor = ler.nextDouble();
				System.out.println("Insira a descricao");
				String descricao = ler.next();
				System.out.println("Digite a Quantidade de produto");
				Integer quantidade = ler.nextInt();

				Produto produto = new Produto(j + 1, nomeProduto, descricao, valor);
				ItensProduto itensProduto = new ItensProduto(produto, quantidade);
				listaItensProduto.add(itensProduto);

				
			}
			
			
			Pedido pedido = new Pedido(usuario, listaItensProduto);

			mapPedido.put(i + 1, pedido);

			
		}

			ler.close();
			System.out.println();

			for (Entry<Integer, Pedido> entry : mapPedido.entrySet()) {
				Integer k = entry.getKey();
				Pedido pedido = entry.getValue();

				System.out.println("IdUsuario:" + pedido.getUsuario().getId());
				System.out.println("Nome:" + pedido.getUsuario().getNome());
				System.out.println("Idade:" + pedido.getUsuario().getIdade());
				System.out.println("Data da Compra:" + pedido.getDataDaCompra());
				for (ItensProduto prod : pedido.getItensProdutos()) {
					System.out.println("Id:" + prod.getProduto().getId());
					System.out.println("Nome:" + prod.getProduto().getNome());
					System.out.println("Descricao:" + prod.getProduto().getDescricao());
					System.out.println("Valor:" + prod.getProduto().getValor());
					System.out.println("Quantidade:" + prod.getQuantidade());
					System.out.println("Sub Total:" + prod.getSubTotal());

				}
				System.out.println("Valor Total:" + pedido.getValorTotal());

			}

		

	}
}
