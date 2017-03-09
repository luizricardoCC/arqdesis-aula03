package aula03;

public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double b){
		super(b, b);
	}
	
	@Override
	public double area() {
		return Math.pow(getBase(), 2) ;
	}

	@Override
	public double perimetro() {
		return 4 * getBase();
	}

	@Override
	public double diagonal() {
		return getBase() * Math.sqrt(2);
	}

	
}
