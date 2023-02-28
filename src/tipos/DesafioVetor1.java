package tipos;

import java.util.Scanner;

public class DesafioVetor1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//declarando vetor de inteiros chamado vetor
		int[] vetor = new int[5];
		
		//laço for para capturar os valores inputados pelo usuário e armazenar no vetor
		for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
        
        //exibe os números do vetor na tela
        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
        
        sc.close();
	}
}
