package tipos;

import java.util.Scanner;

public class IndustriaMulta {

	public static void main(String[] args) {
		
		long qtdVeiculos = 0l, qtdMultados = 0l;
        byte op = 0;
        float velocidadeMaxima;
        double somaVelocidade = 0, velocidade = 0, somaMulta = 0, mediaPorMulta = 0, mediaDeVelocidade = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a velocidade máxima para a via");
        velocidadeMaxima = sc.nextFloat();


        do {
            qtdVeiculos++;

            do {
                System.out.println("Lendo velocidade do veículo...");
                velocidade = sc.nextDouble();
            } while (velocidade <= 0);

            somaVelocidade += velocidade;

            var considerado = velocidade - velocidadeMaxima;

            var multa = 0f;

            if (considerado > 0) {

                if (considerado > 31) {
                    multa = 300;
                } else if (considerado > 10) {
                    multa = 100;
                } else if (considerado > 0) {
                    multa = 50;
                }
                somaMulta += multa;
                qtdMultados++;
                mediaPorMulta = somaMulta / qtdMultados;

                System.out.printf("Veículo multado em: R$ %,.2f\n", multa);
            } else {
                System.out.println("Veículo transitando dentro dos limites de velocidade...");
            }

            mediaDeVelocidade = somaVelocidade / qtdVeiculos;

            System.out.println("Captura proximo veículo?\n1-SIM\n2-NAO");
            op = sc.nextByte();

        } while (op == 1);


        System.out.println("*".repeat(15) + " TOTALIZAÇÃO "+ "*".repeat(15));

        System.out.println("QUANTIDADE DE VEÍCULOS: " + qtdVeiculos);
        System.out.println("VEÍCULOS MULTADOS: " + qtdMultados);
        System.out.printf("PERCENTUAL DE VEICULOS MULTADOS: %,.2f%%\n", (float) ((qtdMultados * 100) / qtdVeiculos));
        System.out.printf("VALOR TOTAL DE MULTAS APLICADAS: R$ %,.2f\n", somaMulta);
        System.out.printf("VELOCIDADE MÉDIA DOS VEÍCULOS: %,.0f KM/h\n", mediaDeVelocidade);
        System.out.printf("VALOR MÉDIO DAS MULTAS APLICADAS: R$ %,.2f \n", mediaPorMulta);

        System.out.println("*".repeat(43));
        
        sc.close();
    }

}
