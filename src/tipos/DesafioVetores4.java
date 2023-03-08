package tipos;

import java.util.Scanner;

public class DesafioVetores4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número de caracteres que serão inputados: ");
		int quantidade = sc.nextInt();
		
		if(quantidade <= 0) {
			System.out.println("Ao que parece voce não deseja utilizar o programa. Caso mude de idéia, retorno com uma quantidade maior que 0. Programa encerrado!");
		}

		char[] caracter = new char[quantidade];
		int numConsoantes = 0;
		String vogais = "aeiouAEIOU";

		//le o input de caracteres do usuario e armazena na variavel caracteres
		for (int i = 0; i < caracter.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º caracter: ");
			caracter[i] = sc.next().charAt(0);
			
			//verifica se o caractere lido não é uma vogal (ou seja, se não está presente na string vogais) e incrementa o contador numConsoantes se for o caso.
			if (!vogais.contains(String.valueOf(caracter[i]))) {
				numConsoantes++;
			}
		}
		
		//exibe a qntd e as consoantes lidas na tela
		
        for (int i = 0; i < caracter.length; i++) {
        	
            if (!vogais.contains(String.valueOf(caracter[i]))) {
            	System.out.println("Foram lidas " + numConsoantes + " consoantes:");
                System.out.println(caracter[i]);
            }
        }

		sc.close();

	}

}
