package duoc.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.bd.dato.Dato;
import duoc.bd.dato.base.BaseDeDatos;

public class BaseDeDatosAgregar {
	
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
	public void cuandoAgregaDatoNullEntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato("", ""));
		assertTrue(!retorno);
	}
	
	@Test
	public void cuandoAgregaDatoIDLength1EntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato("A", "123"));
		assertTrue(!retorno);
	}
	
	@Test
	public void cuandoAgregaDatoIDNullEntoncesFalse() {
		boolean retorno = this.base.agregar(new Dato("", "123"));
		assertTrue(!retorno);
	}

}
