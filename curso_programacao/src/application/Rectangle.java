package application;

public class Rectangle {
	public double largura;
	public double altura;

public double Area() {
	return largura * altura;
}


public double Perimetro() {
	return 2 * (altura + largura);
}

public double Diagonal() {
	return Math.sqrt(Math.pow(altura + largura, 2));
}
}
