package aula03;

public class Retangulo extends Poligono implements Diagonal{

	public Retangulo(double b, double a){
		super(b, a);
	}
	
	@Override
	public double area() {
		return getBase() * getAltura();
	}
	
	@Override
	public double perimetro() {
		return (2 * getBase()) + (2 * getAltura());
	}

	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}
}
