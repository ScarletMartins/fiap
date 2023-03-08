package tipos;

import java.util.Scanner;

public class DesafioVetores6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número de alunos que serão inputados: ");
		int quantidade = sc.nextInt();
		int alunos[] = new int[quantidade];

		// inicializa a variavel de aprovados;
		int alunosAprovados = 0;

		// cria o vetor com as medias;
		double[] medias = new double[quantidade];

		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Digite as notas do " + (i + 1) + "º aluno: ");
//			for (int j = 0; j < 4; j++) {
//				System.out.println((j + 1) + "º nota");
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			double nota4 = sc.nextDouble();

			// armazena as medias do aluno e replica para o indice i do vetor de medias
			double mediaIndividual = (nota1 + nota2 + nota3 + nota4) / 4;
			medias[i] = mediaIndividual;

			if (mediaIndividual >= 7.0) {
				alunosAprovados++;
			}

		}

		System.out.println("A quantidade de alunos aprovados com média maior ou igual a 7.0 é: " + alunosAprovados);
//		}

		sc.close();
	}

}
