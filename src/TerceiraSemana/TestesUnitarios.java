package TerceiraSemana;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import SegundaSemana.CarrinhoDeCompras;
import SegundaSemana.Pizza;

public class TestesUnitarios {
	
	//Testes unitarios das classes Pizza e CarrinhoDeCompras.
	
	@Before
	public void test() {
		Pizza.zeraIngredientes();
	}
	
	@Test
	public void doisIngredientes(){
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Frango");
		//Com 2 ingredientes o valor deve ser R$15.00
		assertEquals(15.0, p1.getPreco(), 0);
	}
	
	@Test
	public void tresIngredientes(){
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Calabresa");
		//Com 2 ingredientes o valor deve ser R$20.00
		assertEquals(20.0, p1.getPreco(), 0);
	}
	
	@Test
	public void cincoOuMaisIngredientes(){
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Queijo");
		p1.adicionaIngrediente("Frango");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Ovo");
		p1.adicionaIngrediente("Catupiry");
		//Com 2 ingredientes o valor deve ser R$23.00
		assertEquals(23.0, p1.getPreco(), 0);
	}
	
	@Test
	public void testCarrinho(){
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		CarrinhoDeCompras carrinho =  new CarrinhoDeCompras();
		
		p1.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Calabresa");
		
		double precoTotal = p1.getPreco() + p2.getPreco() + p3.getPreco();
		
		assertEquals(String.valueOf(precoTotal) ,carrinho.calculaValor(p1,p2,p3));
	}
	
	@Test
	public void testCarrinhoPizzaSemIngredientes(){
		Pizza p1 = new Pizza();
		
		CarrinhoDeCompras carrinho =  new CarrinhoDeCompras();
		
		assertEquals("Pizza nao contem ingredientes",carrinho.calculaValor(p1));
		
	}

}
