import pacote_exercicio04.produto;

public class App {
    public static void main(String[] args) throws Exception {
        produto p1 = new produto(12345);
        p1.setVolume(10);
        p1.chamaTestaUnidade();
        p1.chamaTestaUnidade();
        System.out.println(p1.toString());
    }
}
