package ExercicioMap2;

public class ItensProduto {

	private Produto produto;
	private Integer quantidade;

	public ItensProduto() {

	}

	public ItensProduto(Produto produto, Integer quantidade) {

		this.produto = produto;
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getSubTotal() {
		if(quantidade >= 3) {
		return (produto.getValor() * quantidade)- 1;
			
		}
		return produto.getValor() * quantidade;
		
	}

}
