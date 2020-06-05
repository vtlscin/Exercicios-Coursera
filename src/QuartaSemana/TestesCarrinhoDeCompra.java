package QuartaSemana;

import org.junit.Assert;
import org.junit.Test;

public class TestesCarrinhoDeCompra {

	@Test
	public void testAdicionaProdutosDiferentes() {
		
		ProdutoComTamanho blusa = new ProdutoComTamanho("Blusa", 1, 20.0, 10);
		ProdutoComTamanho sapato = new ProdutoComTamanho("Sapato", 2, 30.0, 15);
		ProdutoComTamanho calca = new ProdutoComTamanho("Calca", 3, 20.0, 13);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(blusa, Integer.valueOf(1));
		carrinho.adicionaProduto(sapato, Integer.valueOf(2));
		carrinho.adicionaProduto(calca, Integer.valueOf(1));
		
		Assert.assertEquals(100.00, carrinho.valorCompra(),0);
		
	}
	
	@Test
	public void testAdicionaProdutosIguais(){
		
		ProdutoComTamanho blusa = new ProdutoComTamanho("Blusa", 1, 20.0, 10);
		ProdutoComTamanho blusaVermelha = new ProdutoComTamanho("Blusa Vermelha", 1, 25.0, 10);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionaProduto(blusa, Integer.valueOf(1));
		carrinho.adicionaProduto(blusaVermelha, Integer.valueOf(1));
		
		//Como os produtos sao iguais, vai incrementar a quantidade
		Assert.assertEquals(40.0, carrinho.valorCompra(),0);
	}
	
	@Test
	public void testAdicionaProdutosTamanhoDiferentes(){
		ProdutoComTamanho sapatoGrande = new ProdutoComTamanho("Sapato Grande", 2, 40.0, 30);
		ProdutoComTamanho sapatoPequeno = new ProdutoComTamanho("Sapato Pequeno", 2, 30.0, 15);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionaProduto(sapatoGrande, Integer.valueOf(1));
		carrinho.adicionaProduto(sapatoPequeno, Integer.valueOf(1));
		
		//Produtos diferentes apenas no tamanho
		Assert.assertEquals(70.0, carrinho.valorCompra(),0);
	}
	
	@Test
	public void testRemoveProdutos(){
		ProdutoComTamanho sapatoGrande = new ProdutoComTamanho("Sapato", 1, 40.0, 30);
		ProdutoComTamanho sapatoPequeno = new ProdutoComTamanho("Sapato", 2, 30.0, 15);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionaProduto(sapatoGrande, Integer.valueOf(3));
		carrinho.adicionaProduto(sapatoPequeno, Integer.valueOf(1));
		
		carrinho.removeProduto(sapatoGrande, 2);
		
		//Como foram removidos 2 sapatos grandes o total tem que ser 70.0
		Assert.assertEquals(70.0, carrinho.valorCompra(),0);
	}
	
	
	// Teste para saber se removendo um produto que tenha quantidade = 1, ele remove do carrinho
	@Test
	public void testRemovendoDoCarrinho(){
		ProdutoComTamanho sapatoGrande = new ProdutoComTamanho("Sapato", 1, 40.0, 30);
		ProdutoComTamanho sapatoPequeno = new ProdutoComTamanho("Sapato", 2, 30.0, 15);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adicionaProduto(sapatoGrande, Integer.valueOf(2));
		carrinho.adicionaProduto(sapatoPequeno, Integer.valueOf(1));
		
		carrinho.removeProduto(sapatoPequeno, 1);
		
		//Como o sapatoPequeno saiu do carrinho a soma tem que ser 80.0
		Assert.assertEquals(80.0, carrinho.valorCompra(),0);

	}
}
