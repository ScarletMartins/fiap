package tipos;

import java.util.Scanner;

public class DataNascimento {

	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano de seu nascimento: (yyyy)");
		int anoNascimento = sc.nextInt();
		
		int anoAtual = sc.nextInt();
		
		int idade = anoAtual - anoNascimento;
		
		System.out.println("Idade presumida: " + idade + " anos");
		
		sc.close();
	}

}
