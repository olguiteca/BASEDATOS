package duoc.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.bd.dato.Dato;
import duoc.bd.dato.base.BaseDeDatos;

public class BaseDeDatosListar {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void cuandoNoAgregaEntoncesListaSize0() {
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero debería ser 0", largo == 0);
	}
	@Test
	public void cuandoAgrega1EntoncesListaSize1() {
		this.base.agregar(new Dato("A2","DATOSS"));
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero debe ser 1", largo == 1);
	}
	@Test
	public void cuandoAgrega5EntoncesListaSize5() {
		this.base.agregar(new Dato("A1","DATOSS"));
		this.base.agregar(new Dato("A2","DATOSS"));
		this.base.agregar(new Dato("A3","DATOSS"));
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero debe ser 3", largo == 3);
	}
}
