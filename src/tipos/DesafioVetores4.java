package tipos;

import java.util.Scanner;

public class DesafioVetores4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char[] caracteres = new char[10];
		int numConsoantes = 0;
		String vogais = "aeiouAEIOU";

		//le o input de caracteres do usuario e armazena na variavel caracteres
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o " + (i + 1) + "º caracter: ");
			caracteres[i] = sc.next().charAt(0);
			
			//verifica se o caractere lido não é uma vogal (ou seja, se não está presente na string vogais) e incrementa o contador numConsoantes se for o caso.
			if (!vogais.contains(String.valueOf(caracteres[i]))) {
				numConsoantes++;
			}
		}
		
		//exibe a qntd e as consoantes lidas na tela
		System.out.println("Foram lidas " + numConsoantes + " consoantes:");
        for (int i = 0; i < 10; i++) {
            if (!vogais.contains(String.valueOf(caracteres[i]))) {
                System.out.println(caracteres[i]);
            }
        }

		sc.close();

	}

}
