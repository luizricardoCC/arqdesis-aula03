package aula03;

public class Losango extends Poligono{
	
	public Losango(double b, double a){
		super(b, a);
	}

	@Override
	public double area() {
		return getBase() * getAltura();
	}
	
	@Override
	public double perimetro() {
		return 4 * getBase();
	}
	
}
