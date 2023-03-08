package tipos;

import java.util.Scanner;

public class DesafioVetores3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a quantidade de notas que serão inputadas: ");
		int quantidade = sc.nextInt();

		if (quantidade <= 0) {
			System.out.println(
					"Ao que parece voce não deseja utilizar o programa. Caso mude de idéia, retorno com uma quantidade maior que 0. Programa encerrado!");
			System.exit(0);
		}

		double[] notas = new double[quantidade];
		double media = 0.0;
		double somaNotas = 0.0;

		// recebe o input das notas pelo user, armazena no vetor notas e acrescenta o
		// valor na variavel media;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a " + (i + 1) + "º nota: ");
			notas[i] = sc.nextDouble();
			somaNotas += notas[i];
		}

		System.out.println("\nNotas computadas: ");
		for (double n : notas) {
			System.out.println(n);
		}

		media = somaNotas / notas.length;

		System.out.printf("Média final das notas computadas: %.2f", media);

		sc.close();
	}

}
