package ExercicioMap2;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private Usuario usuario;
	private double valorTotal;
	private Instant dataDaCompra =Instant.now();
	private List<ItensProduto> itensProdutos = new ArrayList<>();
	
	public Pedido() {
		
	}
	public Pedido(Usuario usuario,List<ItensProduto>itensProdutos) {
		this.usuario = usuario;
		this.itensProdutos = itensProdutos;
	}
	public Pedido(Usuario usuario, double valorTotal, Instant dataDaCompra, List<ItensProduto> itensProdutos) {
		
		this.usuario = usuario;
		this.valorTotal = valorTotal;
		this.dataDaCompra = dataDaCompra;
		this.itensProdutos = itensProdutos;
		
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public double getValorTotal() {
		for (ItensProduto itensProduto : itensProdutos) {
			this.valorTotal += itensProduto.getSubTotal();
		}
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Instant getDataDaCompra() {
		return dataDaCompra;
	}
	public void setDataDaCompra(Instant dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	public List<ItensProduto> getItensProdutos() {
		return itensProdutos;
	}
	public void setItensProdutos(List<ItensProduto> itensProdutos) {
		this.itensProdutos = itensProdutos;
	}
	
	
	
	


}
