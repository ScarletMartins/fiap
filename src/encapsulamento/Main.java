package encapsulamento;

public class Main {

	public static void main(String[] args) {
		
		criarMonitor();
        criarCarro();
    }

    private static void criarMonitor() {
        Monitor monitor = new Monitor();

        monitor.setCor("Preto")
                .set_3d(false).setOn(true).setyResolucao(768)
                .setxResolucao(1024).setMarca("Sceptre").setPolegadas(32);

        Monitor monitor2 = new Monitor();

        monitor2.setCor("Prata")
                .set_3d(true).setOn(true).setyResolucao(768)
                .setxResolucao(1024).setMarca("Sceptre").setPolegadas(28);

        System.out.println(monitor.toString());
        System.out.println(monitor2.toString());
    }


    private static void criarCarro() {
        CarroFormula1 carro = new CarroFormula1();

        carro.setCor("Vermelho").setEscuderia("Ferrari");
        System.out.println(carro.toString());

    }

}
