package QuartaSemana;

import org.junit.Assert;
import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testCompra() {
		Compra c1 = new Compra(20.0);
		Assert.assertEquals(20.0, c1.total(),0);
	}
	
	@Test
	public void testCompraParcelada1() {
		CompraParcelada c = new CompraParcelada(10.0, 1, 1);
		Assert.assertEquals(20.0, c.total(),0);
	}
	
	@Test
	public void testCompraParcelada2() {
		CompraParcelada c = new CompraParcelada(10.0, 2, 1);
		Assert.assertEquals(40.0, c.total(),0);
	}

	@Test
	public void testCompraParcelada5() {
		CompraParcelada c = new CompraParcelada(10.0, 5, 1);
		Assert.assertEquals(320.0, c.total(),0);
	}
	
	@Test
	public void testCompraParcelada10() {
		CompraParcelada c = new CompraParcelada(10.0, 10, 1);
		Assert.assertEquals(10240.0, c.total(),0);
	}
}
