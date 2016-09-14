// Ramos Laura Turno Noche

package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculosTest {

	
	
	@Test
	public void comprobarLaCreacionCirculoRadioDos()
	{
		Circulos miCirculo= new Circulos(2.0);
		assertEquals(2.0,miCirculo.obtenerRadio(),0.01);
		
	}
	@Test
	public void comprobarLaCreacionCirculoRadioTresPuntoSiete()
	{
		Circulos miCirculo= new Circulos(3.7);
		assertEquals(3.7,miCirculo.obtenerRadio(),0.01);
	}
	@Test
	public void comprobarLaCreacionCirculoRadioCinco()
	{
		Circulos miCirculo= new Circulos(5.0);
		assertEquals(5.0,miCirculo.obtenerRadio(),0.01);
		
	}
	@Test
	public void comprobarLaCreacionCirculoRadioDiezPuntoNueve()
	{
		Circulos miCirculo= new Circulos(10.9);
		assertEquals(10.9,miCirculo.obtenerRadio(),0.01);
	}
	
	///////////////////Comprobar Perimetros//////////////////
	
	@Test
	public void comprobarLaCreacionCirculoRadioNuevePuntoOcho()
	{
		Circulos miCirculo= new Circulos(9.8);
		assertEquals(9.8,miCirculo.obtenerRadio(),0.01);
		assertEquals(61.54,miCirculo.calcularPerimetro(),0.01);
	}
	
	@Test
	public void comprobarLaCreacionCirculoRadioDieciseisPuntoSeis()
	{
		Circulos miCirculo= new Circulos(16.6);
		assertEquals(16.6,miCirculo.obtenerRadio(),0.01);
		//calculo perimetro
		assertEquals(104.24,miCirculo.calcularPerimetro(),0.01);
		//calculo Area
		assertEquals(865.25,miCirculo.calcularArea(),0.01);
	}
	
	
	
}
