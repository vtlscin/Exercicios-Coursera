package QuintaSemana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteAutoridade {

	@Test
	public void testInformal() {
		Informal informal = new Informal();
		
		Autoridade autoridade = new Autoridade("Vinicius", "Thiago", informal);
		
		assertEquals("Vinicius", autoridade.getTratamento());
	}

	@Test
	public void testRespeitoso() {
		Respeitoso respeitoso = new Respeitoso("masculino");
		
		Autoridade autoridade = new Autoridade("Vinicius", "Thiago", respeitoso);
		
		assertEquals("Sr.Thiago", autoridade.getTratamento());
	}
	
	@Test
	public void testComTitulo() {
		ComTitulo comTitulo = new ComTitulo("Magnifico");
		
		Autoridade autoridade = new Autoridade("Vinicius", "Thiago", comTitulo);
		
		assertEquals("Magnifico Vinicius Thiago", autoridade.getTratamento());
	}
	
}
