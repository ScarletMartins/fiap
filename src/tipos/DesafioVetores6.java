package tipos;

import java.util.Scanner;

public class DesafioVetores6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double notas;
		double mediaIndividual = 0.0;
		double[] media = new double[2];
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Digite as notas do " + (i + 1) + "º aluno");
			for(int j = 0; j < 4; j++) {
				System.out.println((j+1) + "º nota");
				notas = sc.nextDouble();
				mediaIndividual += notas;
			}
		}
		
		System.out.println(mediaIndividual);
		
		sc.close();
	}

}
