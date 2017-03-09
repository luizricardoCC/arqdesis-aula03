package aula03;

public class Triangulo extends Poligono{
	
	public Triangulo(double b, double a){
		super(b, a);
	}

	@Override
	public double area() {
		return getBase() * getAltura() / 2;
	}
	
	@Override
	public double perimetro() {
		return 3 * getBase();
	}
	
}
