import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class Circulo_RLDTest3  {
	
	private Circulo_RLD Circulo;
	private double res;
	
	
	
	@Before
	public void inicio() {
	Circulo=new Circulo_RLD(-3.0,"circulo");
	}
	
	@After
	public void fin () {
		Circulo=null;
	}
	
	@Test
	public void testCirculo_RLD() {
		assertNotNull(Circulo);
	}
	
	@Test
	public void testArea() {
		res=Circulo.area();
		System.out.print(res);
		assertEquals(28.2744,res,0);
	}

	@Test
	public void testPerimetro() {
		res=Circulo.perimetro();
		System.out.print(res);
		assertEquals(-18.8496,res,0);
		}

}