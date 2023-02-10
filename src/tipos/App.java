package tipos;

import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String name = sc.next();
		
		System.out.println("\nOlá, " + name + ". Seja bem vindo(a)!");
		
		
		sc.close();
	}

}
