package application;

public class Aluno {
	
	String nome;
	String curso;
	int semestre;
	double nota1;
	double nota2;
	double media;
  
	public Aluno(String nome, String curso,int semestre,double nota1,double nota2, double media) {
		this.nome = nome;
		this.curso = curso;
		this.semestre = semestre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = media;
		
	}
	
	public double calcularMedia() {
		media = (nota1 + nota2)/ 2;
		return media;
	
		
	}
}
