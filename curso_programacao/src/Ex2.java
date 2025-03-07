import java.util.Locale;
import java.util.Scanner;

import application.Aumento;

public class Ex2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aumento funcionario = new Aumento();
		System.out.println("Programa para aumento salarial!!!");
		
		System.out.println("Qual o nome do funcioario?: ");
		funcionario.nome = sc.next();
		System.out.println("Salário Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Taxa do Haddad: ");
		funcionario.taxa = sc.nextDouble();
		
		System.out.println("Dados: "+funcionario);

		System.out.println("Coloque a porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentoSalario(porcentagem);
		System.out.println("Dados atualizados: "+funcionario);
		
	
	
		
		
		
		
		
		

		sc.close();
	

	}

}
