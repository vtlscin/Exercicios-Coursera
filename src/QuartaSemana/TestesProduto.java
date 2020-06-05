package QuartaSemana;

import org.junit.Assert;
import org.junit.Test;

public class TestesProduto {

	@Test
	public void testProdutosIguais() {
		Produto p1 = new Produto("Blusa", 1, 20.0);
		Produto p2 = new Produto("BlusaVermelha", 1, 25.0);
		Assert.assertEquals(p1, p2);
	}
	
	@Test
	public void testProdutosDiferentes() {
		Produto p1 = new Produto("Blusa", 1, 20.0);
		Produto p2 = new Produto("BlusaAzul", 2, 25.0);
		Assert.assertNotEquals(p1, p2);
	}

}
