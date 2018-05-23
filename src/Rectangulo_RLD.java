/**
 * 
 * @author Ruben Lopez Donaire
 * @version 1.1
 *  se declaran los atributos double l1 y l2
 */


public class Rectangulo_RLD extends FiguraGeometrica_RLD {
	private double l1;
	private double l2;
	
	/**
	 * 
	 * @param tipoFigura cadena tipo de figura
	 * @param lG parametro  lado 1
	 * @param lP parametro lado 2
	 */
	
	public Rectangulo_RLD(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
/**
	 * 
	 * @return devuelve  multiplicando los parametros l1y12 el valor del area
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * 
	 * @return devuelve el valor del perimetro parametro l1*2+parametrol2*2 
	 */
	
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
