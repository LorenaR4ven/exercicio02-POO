package exercicio02;

public final class RetanguloBordaArredondada extends Retangulo {
    public RetanguloBordaArredondada(int altura, int largura) {
        super(altura, largura);
    }

    @Override
    public void desenhar() {
        // Constrói a linha horizontal do retângulo
        StringBuilder horizontal = new StringBuilder();
        for (int i = 0; i < getLargura(); i++) {
            horizontal.append("─"); //usei o .append para acicionar "─" suficiente à largura
        }
        // usa a linha horizontal criada e adiciona os "/","\" para dar a impressão de arredondar
        System.out.println("/" + horizontal + "\\"); // tive que usar "\\" pq ele dava erro usando apenas 1
        for (int i = 0; i < getAltura() - 2; i++) {
            System.out.println("│" + " ".repeat(getLargura()) + "│"); // para saber o espaçamento do vácuo dentro eu usei a mesma largura sem o add das bordas
        }
        System.out.println("\\" + horizontal + "/"); //fecha o retangulo
    }
}
