package tipos;

import java.util.Scanner;

public class DesafioVetores5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de valores que serão inputados: ");
		int quantidade = sc.nextInt();
		
		if(quantidade <= 0) {
			System.out.println("Ao que parece voce não deseja utilizar o programa. Caso mude de idéia, retorno com uma quantidade maior que 0. Programa encerrado!");
			System.exit(0);
		}

		int[] vetor = new int[quantidade];
		int[] pares = new int[quantidade];
		int[] impares = new int[quantidade];

		// recebe os números de entrada do usuário e os armazena no array vetor;
		// se o número for par, adiciona ao array pares;
		// se o número for ímpar, adiciona ao array impares;
		
		//variaveis adicionais j(par) e k(impar), para definir o indice em cada array separado
		for (int i = 0, j = 0, k = 0; i < vetor.length; i++) {
		    System.out.println("Digite o " + (i + 1) + "º número: ");
		    int n = sc.nextInt();
		    vetor[i] = n;

		    if (vetor[i] % 2 == 0) {
		        pares[j] = vetor[i];
		        j++;
		    } else {
		        impares[k] = vetor[i];
		        k++;
		    }
		}

		// imprime o array vetor
		System.out.print("O vetor de números lidos é: \n");
		for (int i = 0; i < vetor.length; i++) {
		    System.out.println(vetor[i]);
		}

		// imprime o array pares
		System.out.print("O vetor de números pares é: \n");
		for (int i = 0; i < pares.length; i++) {
			//verifica se o valor armazenado é diferente de zero antes de imprimir, 'limpando' a saída
		    if (pares[i] != 0) {
		        System.out.println(pares[i]);
		    }
		}

		// imprime o array impares
		System.out.print("O vetor de números ímpares é: \n");
		for (int i = 0; i < impares.length; i++) {
		    if (impares[i] != 0) {
		        System.out.println(impares[i]);
		    }
		}

		sc.close();


	}

}
