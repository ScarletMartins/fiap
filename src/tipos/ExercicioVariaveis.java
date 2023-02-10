package tipos;

import java.util.Scanner;

public class ExercicioVariaveis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a nota da prova semestral: ");
		double notaProvaSemestral = sc.nextDouble();
		
		System.out.println("Informe a nota do trabalho de conclusão de curso: ");
		double notaTCC = sc.nextDouble();
		
		System.out.println("Informe a nota das duas avaliações de semestre: ");
		System.out.println("1* avaliação de semestre: ");
		double notaPrimeiraAvaliacao = sc.nextDouble();
		System.out.println("2* avaliação de semestre: ");
		double notaSegundaAvaliacao = sc.nextDouble();
		
		double mediaFinal = (notaProvaSemestral * 0.5) + (notaTCC * 0.3) + (((notaPrimeiraAvaliacao + notaSegundaAvaliacao) / 2) * 0.2);
		
		System.out.printf("Média final do aluno: %.2f", mediaFinal);
		
		
		sc.close();
	}

}
