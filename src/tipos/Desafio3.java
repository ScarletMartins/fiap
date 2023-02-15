package tipos;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		/**
		 * * Uma ONG resolveu prestar um serviço bem diferente: ela oferece vans para
		 * buscar pessoas com qualquer tipo de dificuldade de locomoção para poderem
		 * votar. * Para evitar problemas no momento do embarque, você foi convidado a
		 * criar um programa que valide a idade dos passageiros: *
		 * <p>
		 * * Caso tenham 16 anos ou menos, não podem votar (e nem embarcar). * Caso
		 * tenham entre 16 anos e 18 incompletos ou mais de 65 anos, podem optar por
		 * votar ou não. * Caso tenham entre 18 e 65 anos incompletos, devem votar
		 * obrigatoriamente. * Crie um programa que receba a idade dos passageiros em
		 * potencial e indique se podem embarcar e votar.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a idade da pessoa que irá embarcar: ");
		int idade = sc.nextInt();
		
		if(idade >= 16) {
			if(idade >= 18 && idade < 65) {
				System.out.println("Voto obrigatório. Embarque liberado.");
			} else {
				System.out.println("Voto opcional. Embarque liberado.");
			}
		} else {
			System.out.println("Menores de 16 anos não podem votar. Embarque não liberado!");
		}
		
		sc.close();

	}
}
