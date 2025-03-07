package application;

public class Aluno {

	public String name;
	public String curso;
	public int semestre;
	public double nota1;
	public double nota2;

	public Aluno(String name, String curso, int semestre, double nota1, double nota2) {
		this.name = name;
		this.curso = curso;
		this.semestre = semestre;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public double calcularMedia() {
		
		return (nota1 + nota2) / 2;

	}

}
