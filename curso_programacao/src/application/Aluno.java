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

	public double calcularMedia() {
		return (nota1 + nota2) / 2;

	}

	public void situaçãoAluno() {
		if (this.media < 3) {
			this.situacao = "Reprovado";
		} else if (this.media >= 3 && this.media <= 5) {
			this.situacao = "Exame";

		} else {
			this.situacao = "Aprovado";
		} 
		
	} public void exameAluno(double notaExame) {
		this.situacao.equals("Exame");
		this.notaExame = notaExame;
		
		if(this.notaExame > 6) {
			this.situacao = "Aprovado";
		} else {
			this.situacao = "Reprovado";
		}
	}
}
