package tipos;

import java.util.Scanner;

public class DesafioVetor1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantidade = pegarQntd(sc);
		int[] numeros = new int[quantidade];
		numeros = informarNumeros(numeros, sc);
		imprimir(numeros);
	}

	public static int pegarQntd(Scanner sc) {

		System.out.println("Informe a quantidade de valores que serão inputados: ");
		int quantidade = sc.nextInt();

		if (quantidade <= 0) {
			System.out.println(
					"Ao que parece voce não deseja utilizar o programa. Caso mude de idéia, retorno com uma quantidade maior que 0. Programa encerrado!");
			System.exit(0);
		}
		return quantidade;
	}

	public static int[] informarNumeros(int[] numeros, Scanner sc) {
		// laço for para capturar os valores inputados pelo usuário e armazenar no vetor
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numeros[i] = sc.nextInt();
		}
		return numeros;
	}

	public static void imprimir(int[] numeros) {
		// exibe os números do vetor na tela
		System.out.println("Números digitados:");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}