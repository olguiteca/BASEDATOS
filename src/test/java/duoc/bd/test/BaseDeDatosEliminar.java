package duoc.bd.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import duoc.bd.dato.Dato;
import duoc.bd.dato.base.BaseDeDatos;

public class BaseDeDatosEliminar {
	
	private BaseDeDatos base;

	@Before
	public void setUp() throws Exception {
		
		this.base = new BaseDeDatos();
		
		this.base.agregar(new Dato("A1","DATO DE A1"));
		this.base.agregar(new Dato("A2","DATO DE A2"));
		this.base.agregar(new Dato("A3","DATO DE A3"));
		this.base.agregar(new Dato("A4","DATO DE A4"));
		this.base.agregar(new Dato("A5","DATO DE A5"));
	}
		

	@Test
	public void cuandoElimina1Entonces4() {
		this.base.eliminar("A3");
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero deberia ser 4",largo == 4);
	}
	@Test
	public void cuandoElimina1EntoncesTrue() {
		boolean respuesta = this.base.eliminar("A3");
		assertTrue(respuesta);
	}
	@Test
	public void cuandoNoEliminaEntoncesFalse() {
		boolean respuesta = this.base.eliminar("A6");
		assertFalse(respuesta);
	}

}
