import java.util.Locale;
import java.util.Scanner;

import application.Aluno;

public class Cadastro_Alunos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Insira o nome do aluno: ");
		aluno.nome = sc.next();
		System.out.println("Insira o curso em que o aluno está matriculado: ");
		aluno.curso = sc.next();
		System.out.println("Insira o semestre que o aluno está: ");
		aluno.semestre = sc.nextInt();
		System.out.println("NOVA BRANCH NO ECPLISE DE MALUKÃOP MESMO");
		
		
		
		sc.close();

	}

}
