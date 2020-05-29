package TerceiraSemana;

import org.junit.Assert;
import org.junit.Test;

import PrimeiraSemana.Paciente;

public class TestesUnitariosIMC {

	@Test
	public void testBaixoPesoMuitoGrave() {
		Paciente p1 = new Paciente(50, 1.80);
		Assert.assertEquals("Baixo peso muito grave", p1.diagnostico());
	}
	
	@Test
	public void testBaixoPesoGrave() {
		Paciente p4 = new Paciente(50, 1.75);
		Assert.assertEquals("Baixo peso grave", p4.diagnostico());
	}
	
	@Test
	public void testBaixoPeso() {
		Paciente p5 = new Paciente(50, 1.70);
		Assert.assertEquals("Baixo peso", p5.diagnostico());
	}
	
	@Test
	public void testPesoNormal() {
		Paciente p2 = new Paciente(60, 1.70);
		Assert.assertEquals("Peso normal", p2.diagnostico());
	}
	
	@Test
	public void testSobrepeso() {
		Paciente p3 = new Paciente(85, 1.83);
		Assert.assertEquals("Sobrepeso", p3.diagnostico());
	}

	@Test
	public void testObesidadeI() {
		Paciente p6 = new Paciente(85, 1.60);
		Assert.assertEquals("Obesidade grau I", p6.diagnostico());
	}
	
	@Test
	public void testObesidadeII() {
		Paciente p7 = new Paciente(95, 1.60);
		Assert.assertEquals("Obesidade grau II", p7.diagnostico());
	}
	
	@Test
	public void testObesidadeIII() {
		Paciente p8 = new Paciente(105, 1.60);
		Assert.assertEquals("Obesidade grau III(obesidade morbida)", p8.diagnostico());
	}
}
