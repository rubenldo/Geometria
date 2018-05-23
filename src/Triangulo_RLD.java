
public class Triangulo_RLD extends FiguraGeometrica_RLD {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo_RLD(String tipoFigura, double lado1, double lado2, double lado3) {
		super(tipoFigura);

	}

	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}

	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.perimetro() / 2;
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
}
