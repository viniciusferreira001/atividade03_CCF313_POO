import java.util.ArrayList;

import pacote_exercicio03.forma;
import pacote_exercicio03.circulo;
import pacote_exercicio03.quadrado;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<forma> formas = new ArrayList<forma>();
        forma f1 = new quadrado(2);
        formas.add(f1);
        forma f2 = new circulo(2);
        formas.add(f2);
        System.out.printf("Area quadrado: %.2f", formas.get(0).calcularArea());
    }
}
