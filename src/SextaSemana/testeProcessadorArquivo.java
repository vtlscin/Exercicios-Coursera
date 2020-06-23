package SextaSemana;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class testeProcessadorArquivo {

	@Test
	public void testSucesso() throws LeituraArquivoException {
		Map<String,String> resultado = ProcessadorArquivo.processar("pessoa.txt");
		Assert.assertEquals("Eduardo", resultado.get("nome"));
	}
	
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoVazio() throws LeituraArquivoException {
		@SuppressWarnings("unused")
		Map<String,String> resultado = ProcessadorArquivo.processar("arquivoVazio.txt");
	}
	
	// Teste considerando uma linha com mais de um "->"
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoInvalido() throws LeituraArquivoException {
		ProcessadorArquivo.processar("arquivoInvalido.txt");
	}
	
	//Teste considerando uma linha sem "->"
	@Test(expected=LeituraArquivoException.class)
	public void testArquivoInvalido2() throws LeituraArquivoException {
		ProcessadorArquivo.processar("arquivoInvalido2.txt");
	}
}
