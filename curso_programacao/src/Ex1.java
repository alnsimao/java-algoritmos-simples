import java.util.Locale;
import java.util.Scanner;

import application.Rectangle;

public class Ex1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle retangulo = new Rectangle();
		
		
		
		System.out.println("Coloque a altura e a largura do seu retângulo: ");
		
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		
		System.out.println("AREA DO RETANGULO: "+ retangulo.Area());
		System.out.println("PERIMETRO DO RETANGULO: "+ retangulo.Perimetro());
		System.out.println("DIAGONAL DO RETANGULO: "+ retangulo.Diagonal());
		
		
		sc.close();
		
	}

}
