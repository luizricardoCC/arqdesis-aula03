package aula03;

public class Cubo extends Quadrado implements Volume {

	public Cubo(double b) {
		super(b);
	}

	@Override
	public double volume() {
		return Math.pow(getBase(), 3);
	}

}
