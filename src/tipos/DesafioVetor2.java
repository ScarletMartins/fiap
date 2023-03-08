package tipos;

import java.util.Scanner;

public class DesafioVetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantidade = pegarQntd(sc);
		double[] numeros = new double[quantidade];
		numeros = informarNumeros(numeros, sc);
		imprimeInverso(numeros);
		sc.close();
	}

	public static int pegarQntd(Scanner sc) {
		System.out.println("Quantos números você deseja armazenar? ");
		int quantidade = sc.nextInt();

		if (quantidade <= 0) {
			System.out.println(
					"Ao que parece voce não deseja utilizar o programa. Caso mude de idéia, retorno com uma quantidade maior que 0. Programa encerrado!");
			System.exit(0);
		}
		return quantidade;
	}

	public static double[] informarNumeros(double[] numeros, Scanner sc) {
		// pega o input dos valores pelo user e armazena no vetor numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "° número:");
			numeros[i] = sc.nextDouble();
		}
		return numeros;
	}

	public static void imprimeInverso(double[] numeros) {
		System.out.println("Números armazenados na ordem inversa ");
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println("O " + (i + 1) + "° número digitado foi: " + numeros[i]);
		}
	}
}
