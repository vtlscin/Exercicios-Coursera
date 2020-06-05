package QuartaSemana;

import org.junit.Assert;
import org.junit.Test;

public class TesteProdutoComTamanho {

	// Os produtos so sao considerados iguais se o tamanho e codigo forem iguais
	@Test
	public void testProdutosIguais() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Blusa", 1, 20.0, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("BlusaAzul", 1, 25.0, 10);
		Assert.assertEquals(p1, p2);
	}
	
	@Test
	public void testProdutosDiferentesTamanhosDiferentes() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Blusa", 1, 20.0, 19);
		ProdutoComTamanho p2 = new ProdutoComTamanho("BlusaAzul", 1, 25.0, 10);
		Assert.assertNotEquals(p1, p2);
	}

	
	@Test
	public void testProdutosDiferentesCodigosDiferentes() {
		ProdutoComTamanho p1 = new ProdutoComTamanho("Blusa", 5, 20.0, 10);
		ProdutoComTamanho p2 = new ProdutoComTamanho("BlusaAzul", 1, 25.0, 10);
		Assert.assertNotEquals(p1, p2);
	}
}
