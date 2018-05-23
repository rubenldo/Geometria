import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class Circulo_RLDTest  {
	
	private Circulo_RLD Circulo;
	private double res;
	
	
	
	@Before
	public void inicio() {
	Circulo=new Circulo_RLD(7.0,"circulo");
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
		assertEquals(153.9384,res,0);
	}

	@Test
	public void testPerimetro() {
		res=Circulo.perimetro();
		System.out.print(res);
		assertEquals(43.9824,res,0);
		}

}