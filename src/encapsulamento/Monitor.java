package encapsulamento;

public class Monitor {
    private String marca;
    private float polegadas;
    private String cor;
    private int xResolucao;
    private int yResolucao;
    private boolean on = false;
    private boolean _3d;

    public String getMarca() {
        return marca;
    }

    public Monitor setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public float getPolegadas() {
        return polegadas;
    }

    public Monitor setPolegadas(float polegadas) {
        this.polegadas = polegadas;
        return this;
    }

    public String getCor() {
        return cor;
    }

    public Monitor setCor(String cor) {
        this.cor = cor;
        return this;
    }

    public int getxResolucao() {
        return xResolucao;
    }

    public Monitor setxResolucao(int xResolucao) {
        this.xResolucao = xResolucao;
        return this;
    }

    public int getyResolucao() {
        return yResolucao;
    }

    public Monitor setyResolucao(int yResolucao) {
        this.yResolucao = yResolucao;
        return this;
    }

    public boolean isOn() {
        return on;
    }

    public Monitor setOn(boolean on) {
        this.on = on;
        return this;
    }

    public boolean is_3d() {
        return _3d;
    }

    public Monitor set_3d(boolean _3d) {
        this._3d = _3d;
        return this;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                ", polegadas=" + polegadas +
                ", cor='" + cor + '\'' +
                ", xResolucao=" + xResolucao +
                ", yResolucao=" + yResolucao +
                ", on=" + on +
                ", _3d=" + _3d +
                '}';
    }
}