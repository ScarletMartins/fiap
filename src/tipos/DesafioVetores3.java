package tipos;

import java.util.Scanner;

public class DesafioVetores3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		double media = 0.0;
		
		for (int i = 0; i < 4; i++) {
            System.out.print("Digite a " + (i+1) + "º nota: ");
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
		
		System.out.println("\nNotas computadas: ");
		for (double n:notas) {
			System.out.println(n);
		}
		
		media = media / notas.length;
		
		System.out.printf("Média final das notas computadas: %.2f", media);
		
		
		sc.close();
	}

}
