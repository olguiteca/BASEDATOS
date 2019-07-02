package duoc.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.bd.dato.Dato;
import duoc.bd.dato.base.BaseDeDatos;

public class BaseDeDatosAgregarOrdenado {

	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoAgrega1YBaseVaciaEntoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("A1","DATOZ"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoAgrega1ConIDQueExisteEntoncesFalse() {
		this.base.agregar(new Dato("A1","DATA DE A1"));
		this.base.agregar(new Dato("A2","DATA DE A2"));
		boolean retorno = this.base.agregar(new Dato("A2","DATOZ"));
		assertTrue(!retorno);
	}
	
	@Test
	public void cuandoAgrega1ConIDQueNoExisteEntoncesTrue() {
		this.base.agregar(new Dato("A1","DATA DE A1"));
		this.base.agregar(new Dato("A2","DATA DE A2"));
		boolean retorno = this.base.agregar(new Dato("A0","DATOZ"));
		assertTrue(retorno);
	}

}
