package aula03;

public class Trapezio extends Poligono{

	private double baseMenor, baseMaior;
	
	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public Trapezio(double baseMenor, double baseMaior, double altura){
		super(baseMenor + baseMaior, altura);
		setBaseMenor(baseMenor);
		setBaseMaior(baseMaior);
	}
	
	private double lateral(){
		return Math.sqrt( Math.pow(getAltura(), 2) + Math.pow( (getBaseMaior() - getBaseMenor() )/2, 2) ); 
	}
	
	@Override
	public double area() {
		return getBase() * getAltura() / 2;
	}

	@Override
	public double perimetro() {
		return getBase() + lateral();
	}

}
