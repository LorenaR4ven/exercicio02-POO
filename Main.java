package exercicio02;

public class Main {
    public static void main(String[] args) {
        Retangulo retLinhaDupla = new RetanguloLinhaDupla(4, 10);
        Retangulo retPontilhado = new RetanguloPontilhado(4, 10);
        Retangulo retBordaArredondada = new RetanguloBordaArredondada(4, 10);

        System.out.println("Retângulo com Linha Dupla:");
        retLinhaDupla.desenhar();
        System.out.println("\nRetângulo Pontilhado:");
        retPontilhado.desenhar();
        System.out.println("\nRetângulo com Bordas Arredondadas:");
        retBordaArredondada.desenhar();
    }
}
