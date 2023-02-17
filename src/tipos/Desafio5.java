package tipos;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double nota =0;
		
		
		System.out.println("Informe a quantidade de alunos: ");
		int alunos = sc.nextInt();
		
		for(int i = 1; i <= alunos; i++) {
			System.out.println("\nInforme a nota do #" + i + " aluno: ");
			nota += sc.nextDouble();
		}
		
		
		System.out.println("\nA média geral da sala é: " + (nota/alunos));
		
		sc.close();

	}

}
