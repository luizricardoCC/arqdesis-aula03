package aula03;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(new Circulo(10.0));
		figuras.add(new Quadrado(5.0));
		figuras.add(new Retangulo(5.0, 10.0));
		figuras.add(new Triangulo(5.0, 10.0));
		figuras.add(new Losango(7.0, 10.0));
		figuras.add(new Esfera(10.0));
		figuras.add(new Cilindro(10.0, 5.0));
		figuras.add(new Cubo(7.0));
		figuras.add(new Piramide(7.0, 10.0));
		
		for( Figura fig:figuras){
			System.out.println("Perímetro " + fig.perimetro());
			System.out.println("Área " + fig.area());
			if( fig instanceof Diagonal){
				System.out.println("Diagonal " + ((Diagonal)fig).diagonal());
			}
			if( fig instanceof Volume){
				System.out.println("Volume " + ((Volume)fig).volume());
			}
			System.out.println("\n");
			
		}
		
	}

}
