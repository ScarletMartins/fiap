package tipos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DesafioVetor2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//declara um vetor do tipo double de 10 posicoes
		Double vetor[] = new Double[10];

		//captura o input do usuario dos valores e armazena na variavel
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			vetor[i] = sc.nextDouble();
		}
		
		//ordena os numeros inputados em ordem inversa
		for (int i = 0; i < 10; i++) {
			Arrays.sort(vetor, Collections.reverseOrder());
		}
		
		//imprime a variavel
		for(Double n:vetor) {
			System.out.println(n);
		}

		sc.close();

	}

}
