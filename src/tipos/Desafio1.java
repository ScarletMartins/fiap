package tipos;

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
//		Crie um programa Java que leia a velocidade de um carro e a velocidade máxima para a via: 
//
//			 1. Informe 50 reais se estiver até 10km/h acima; 
//
//			 2. Informe 100 reais se estiver entre 11km/h e 30km/h acima; 
//
//			 3. Informe 300 reais se estiver acima de 31km/h acima.
//		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade máxima permitida da via?");
		int velocidadeMaxima = sc.nextInt();
		System.out.println("\nQual a velocidade do veículo?");
		int velocidadeVeiculo = sc.nextInt();
		
		int velocidadeAcima = velocidadeVeiculo - velocidadeMaxima;
		
		
		if(velocidadeAcima <= 0) {
			System.out.println("\nVelocidade do veículo: " + velocidadeVeiculo + " km/h. Dentro da velocidade permitida na via.");
		}else if(velocidadeAcima > 0 && velocidadeAcima <=10) {
			System.out.println("\nVelocidade do veículo: " + velocidadeVeiculo + " km/h. " + velocidadeAcima + "km/h acima do permitido na via. Valor a ser pago de multa: R$ 50,00");
		}else if(velocidadeAcima <=30) {
			System.out.println("\nVelocidade do veículo: " + velocidadeVeiculo + " km/h. " + velocidadeAcima + "km/h acima do permitido na via. Valor a ser pago de multa: R$ 100,00");
		} else {
			System.out.println("\nVelocidade do veículo: " + velocidadeVeiculo + " km/h. " + velocidadeAcima + "km/h acima do permitido na via. Valor a ser pago de multa: R$ 300,00");
		}
		
		
		sc.close();
		
	}

}
