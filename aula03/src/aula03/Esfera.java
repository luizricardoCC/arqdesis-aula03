package aula03;

public class Esfera extends Circulo implements Volume{

	public Esfera(double raio) {
		super(raio);
	}

	@Override
	public double volume() {
		return 4/3 * Math.PI * Math.pow(getRaio(), 3);
	}

}
