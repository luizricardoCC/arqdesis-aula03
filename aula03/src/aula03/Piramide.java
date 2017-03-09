package aula03;

public class Piramide extends Triangulo implements Volume {

	public Piramide(double b, double a) {
		super(b, a);
	}

	@Override
	public double volume() {
		return 1.0 / 3.0 * Math.pow(getBase(), 2) * getAltura();
	}

}
