package QuintaSemana;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;

public class TestePessoa {

	@Test
	public void testIdadeDataAtual() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("26/09/1995", relogio);
		
		assertEquals(24, pessoa.getIdade(), 0);
	}
	
	@Test
	public void testIdadeDataFixa() throws ParseException {
		Relogio relogio = new Relogio("26/11/2020",0);
		Pessoa pessoa = new Pessoa("26/09/1995", relogio);
		
		assertEquals(25, pessoa.getIdade(), 0);
	}

}
