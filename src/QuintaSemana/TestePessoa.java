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
		assertEquals("Libra", pessoa.getSigno());
	}
	
	@Test
	public void testIdadeDataFixa() throws ParseException {
		Relogio relogio = new Relogio("26/08/2020",0);
		Pessoa pessoa = new Pessoa("26/09/1995", relogio);
		
		assertEquals(24, pessoa.getIdade(), 0);
	}

	@Test
	public void testPessoaSignoAries() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("04/04/1995", relogio);
		
		assertEquals(25, pessoa.getIdade(), 0);
		assertEquals("Áries",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoTouro() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("24/04/1996", relogio);
		
		assertEquals(24, pessoa.getIdade(), 0);
		assertEquals("Touro",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoGemeos() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("10/06/1997", relogio);
		
		assertEquals(23, pessoa.getIdade(), 0);
		assertEquals("Gêmeos",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoCancer() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("22/06/1998", relogio);
		
		assertEquals(22, pessoa.getIdade(), 0);
		assertEquals("Câncer",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoSagitario() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("22/11/1998", relogio);
		
		assertEquals(21, pessoa.getIdade(), 0);
		assertEquals("Sagitário",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoLeao() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("10/08/1998", relogio);
		
		assertEquals(21, pessoa.getIdade(), 0);
		assertEquals("Leão",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoVirgem() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("21/09/1998", relogio);
		
		assertEquals(21, pessoa.getIdade(), 0);
		assertEquals("Virgem",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoEscorpiao() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("20/11/1998", relogio);
		
		assertEquals(21, pessoa.getIdade(), 0);
		assertEquals("Escorpião",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoCapricornio() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("19/01/1998", relogio);
		
		assertEquals(22, pessoa.getIdade(), 0);
		assertEquals("Capricórnio",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoAquario() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("18/02/1998", relogio);
		
		assertEquals(22, pessoa.getIdade(), 0);
		assertEquals("Aquário",pessoa.getSigno());
	}
	
	@Test
	public void testPessoaSignoPeixe() throws ParseException {
		Relogio relogio = new Relogio(1);
		Pessoa pessoa = new Pessoa("21/02/1998", relogio);
		
		assertEquals(22, pessoa.getIdade(), 0);
		assertEquals("Peixes",pessoa.getSigno());
	}
}
