package application;

public class Aluno {

	public String nome;
	public String curso;
	public int semestre;
	public double nota1;
	public double nota2;
	public double media;
	public String situacao;
	public double notaExame;

	public double calcularMedia() {
		return (nota1 + nota2) / 2;

	}

	public String situacaoAluno() {
		media = calcularMedia();
		if (media >= 6 && media <=10 ) {
			situacao = "Aprovado";
		} else if (media <=5 && media >=3) {
			situacao = "Exame";
		}
			else if(media <3 && media >=0) {
			situacao = "Reprovado";
		} else {
			situacao = "Nota inválida, insira novamente";
			
		}
		return this.situacao;

	}

	public void exameAluno(double notaExame) {
		situacao.equals("Exame");
		this.notaExame = notaExame;

		if (this.notaExame > 6) {
			situacao = "Aprovado";
		} else {
			situacao = "Reprovado";
		}
	}

	public String toString() {
	    return "Nome: " + nome + "\n" +
	           "Curso: " + curso + "\n" +
	           "Semestre: " + semestre + "\n" +
	           "Média: " + String.format("%.2f", calcularMedia()) + "\n" +
	           "Situação: " + situacaoAluno();
	}
}
