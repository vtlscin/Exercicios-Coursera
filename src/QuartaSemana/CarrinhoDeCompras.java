package QuartaSemana;

import java.util.HashMap;

public class CarrinhoDeCompras {

	private HashMap<ProdutoComTamanho, Integer> produtos = new HashMap<>();
	
	public void adicionaProduto(ProdutoComTamanho p, Integer quantidadeProduto){
		
		int quantidadeEmProdutos = 0;
		
		if (produtos.containsKey(p)){
			quantidadeEmProdutos = produtos.get(p);
			produtos.put(p, quantidadeProduto + quantidadeEmProdutos);
		}
		else{
			produtos.put(p, quantidadeProduto);
		}
	}
	
	public void removeProduto(ProdutoComTamanho p, Integer quantidadeProduto){
		
		int quantidadeEmProdutos = 0;
		
		if (!produtos.containsKey(p)){
			System.out.println("Produto nao existe no carrinho");
		}
		else{
			quantidadeEmProdutos = produtos.get(p);
			if (quantidadeEmProdutos - quantidadeProduto > 0){
				produtos.put(p, quantidadeEmProdutos - quantidadeProduto);
			}
			else {
				produtos.remove(p);
			}
		}
	}
	
	public double valorCompra(){
		
		double valorTotal = 0.0;
		
		for (ProdutoComTamanho p : produtos.keySet()){
			valorTotal += produtos.get(p) * p.getPreco();
		}
		
		return valorTotal;
	}
	
	public void exibeCarrinho(){
		for (ProdutoComTamanho produto : produtos.keySet()){
			System.out.println(produto.getNome() + " " + produtos.get(produto));
		}
	}
}
