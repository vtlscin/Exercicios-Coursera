package SegundaSemana;

public class Principal {

	public static void main(String[] args) {

		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		p1.adicionaIngrediente("Queijo");
		p2.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Calabresa");
		
		carrinho.calculaValor(p1,p2,p3);
		
		p1.qtdIngredientes();
	}

}
