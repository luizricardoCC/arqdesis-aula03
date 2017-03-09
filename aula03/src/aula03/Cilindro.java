package aula03;

public class Cilindro extends Circulo implements Volume{
	private double altura; 
	public Cilindro(double raio, double altura) {
		super(raio);
		setAltura(altura);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double volume() {
		return area() * getAltura();
	}

}
