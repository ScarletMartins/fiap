package tipos;

import java.util.Scanner;

public class Desafio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o ano a ser consultado:(YYYY)");
		int ano = sc.nextInt();
		
		if(ano%400 == 0 || (ano%4 == 0 && ano%100==1)) {
			System.out.println("\nO ano informado: " + ano + " é um ano bissexto");
		} else {
			System.out.println("\nO ano informado: " + ano + " não é um ano bissexto");
		}
		
		sc.close();
	}
}
