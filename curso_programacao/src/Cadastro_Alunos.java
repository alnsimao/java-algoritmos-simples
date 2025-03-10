import java.util.Locale;
import java.util.Scanner;

import application.Aluno;

public class Cadastro_Alunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Insira o curso em que o aluno está matriculado: ");
		aluno.curso = sc.nextLine();
		System.out.println("Insira o semestre que o aluno está: ");
		aluno.semestre = sc.nextInt();
		System.out.println("Coloque as notas do aluno (2): ");
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		System.out.println(aluno.calcularMedia());
		System.out.println(aluno);

		String situacao = aluno.situacaoAluno();

		if (situacao.equals("Exame")) {
			System.out.println("O aluno está de exame. Insira a nota do exame: ");
			
			aluno.notaExame = sc.nextDouble();
			
			System.out.println("Exame: " + aluno.exameAluno(situacao) + "\n\n");
			
			
			System.out.println("Nome: " + aluno.nome + "\n" + "Curso: " + aluno.curso + "\n" + "Semestre: "
					+ aluno.semestre + "º Semestre" + "\n" + "Nota Exame: " + aluno.notaExame + "\n" + "Situação Final: "
					+ aluno.exameAluno(situacao));
		}

		sc.close();

	}

}
