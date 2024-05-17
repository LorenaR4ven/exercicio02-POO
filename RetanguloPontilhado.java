package exercicio02;

public final class RetanguloPontilhado extends Retangulo {
    public RetanguloPontilhado(int altura, int largura) {
        super(altura, largura);
    }

    @Override
    public void desenhar() {
        // foi usado a mesma lógica de criação de linha e bordas
        for (int i = 0; i < getLargura(); i++) {
            System.out.print(".");
        }
        System.out.println();
        for (int i = 0; i < getAltura() - 2; i++) {
            System.out.print(".");
            for (int j = 0; j < getLargura() - 2; j++) {
                System.out.print(" "); // aqui ele impreme os espaços do meio vazio
            }
            System.out.println(".");
        }
        for (int i = 0; i < getLargura(); i++) {
            System.out.print(".");
        }
        System.out.println();
}
}


