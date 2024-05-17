package exercicio02;

public final class RetanguloLinhaDupla extends Retangulo {
    public RetanguloLinhaDupla(int altura, int largura) {
        super(altura, largura); // Chama o construtor da classe base Retangulo
    }

    @Override
    public void desenhar() {
        // a mesma lógica foi usada para a criação da linha horizontal e bordas
        StringBuilder horizontal = new StringBuilder();
        for (int i = 0; i < getLargura(); i++) {
            horizontal.append("═");
        }
        System.out.println("╔" + horizontal + "╗");
        for (int i = 0; i < getAltura() - 2; i++) {
            System.out.println("║" + " ".repeat(getLargura()) + "║");
        }
        System.out.println("╚" + horizontal + "╝");
    }
}

