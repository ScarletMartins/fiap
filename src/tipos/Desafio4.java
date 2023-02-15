package tipos;

import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("\n" + nome + ", digite uma opção para receber um elogio. \n1-Elogio profissional \n2-Elogio físico \n3-Elogio pessoal");
		int elogio = sc.nextInt();

		switch (elogio) {
		case 1:
			System.out.println("\nParabéns por sua dedicação e profissionalismo, características essas que são muito admiráveis! ");
			break;
		case 2:
			System.out.println("\nSua beleza é inesquecível. Quem te vê uma vez, tem a sorte de guardá-la para sempre na memória.");
			break;
		case 3:
			System.out.println("\nVocê é especial e sua mente é brilhante. É tão bom passar bons momentos com pessoas inteligentes e carismáticas como você.");
			break;
		default:
			System.out.println("\nOpção inválida, elogio não encontrado :(");
		}

		sc.close();
	}
}