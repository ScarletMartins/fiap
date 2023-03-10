package encapsulamento;

public class CarroFormula1 {

	private String cor;
	private String escuderia;
	private boolean status;
	private float velocidadeAtual;
	private float valor;

	public String getCor() {
		return cor;
	}

	public CarroFormula1 setCor(String cor) {
		this.cor = cor;
		return this;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public CarroFormula1 setEscuderia(String escuderia) {
		this.escuderia = escuderia;
		return this;
	}

	public boolean isStatus() {
		return status;
	}

	public CarroFormula1 setStatus(boolean status) {
		this.status = status;
		return this;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public CarroFormula1 setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
		return this;
	}

	public float getValor() {
		return valor;
	}

	public CarroFormula1 setValor(float valor) {
		this.valor = valor;
		return this;
	}

	@Override
	public String toString() {
		return "CarroFormula1{" + "cor='" + cor + '\'' + ", escuderia='" + escuderia + '\'' + ", status=" + status
				+ ", velocidadeAtual=" + velocidadeAtual + ", valor=" + valor + '}';
	}
}
