package application;

public class Aluno {
	
	String nome;
	String curso;
	int semestre;
	double nota1;
	double nota2;
	double media;
	String situacao;
	double notaExame;
  
	public Aluno(String nome, String curso,int semestre,double nota1,double nota2, double media) {
		this.nome = nome;
		this.curso = curso;
		this.semestre = semestre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = calcularMedia();
		
	}
	
	public double calcularMedia() {
		return (nota1 + nota2)/ 2;
			
		}
	
	public void situaçãoAluno() {
		if (this.media < 3 ) {
			this.situacao = "Reprovado";
		} else if (this.media >=3 && this.media <=5) {
			this.situacao = "Exame";
			
			} else {
				this.situacao = "Aprovado";
			}
			 

			
		}
	}
	
