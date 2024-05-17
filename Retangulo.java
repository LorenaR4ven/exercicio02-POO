package exercicio02;

public abstract class Retangulo {
    private final int altura;
    private final int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public abstract void desenhar();
}