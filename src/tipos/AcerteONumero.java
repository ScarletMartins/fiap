package tipos;

import java.util.Random;
import java.util.Scanner;

public class AcerteONumero {

	public static void main(String[] args) {

         int num;
         Scanner sc = new Scanner(System.in);
         Random rnd = new Random(); //Inicia Aleatório 
         int x = rnd.nextInt(100);  //Gera um número aleatório (0 – 99)
         
         do {
             
             System.out.println("----------ADIVINHE O NUMERO OCULTO-----------");
             
             System.out.println("\nInforme um numero entre 0 a 99: ");
             num = sc.nextInt();
         if(num > x) {
             System.out.println("O número escondido é menor!\n");
         } else if (num < x) {
             System.out.println("O número escondido é maior!!\n");
         } else {
             System.out.println("\nVoce acertou!!!");
         }
         }while (num != x);
         
         sc.close();
    }
}

