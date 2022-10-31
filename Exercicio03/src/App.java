import java.util.ArrayList;

import pacote_exercicio03.forma;
import pacote_exercicio03.circulo;
import pacote_exercicio03.quadrado;
import pacote_exercicio03.retangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<forma> formas = new ArrayList<forma>();
        forma f1 = new quadrado(2);
        formas.add(f1);
        forma f2 = new circulo(2);
        formas.add(f2);
        forma f3 = new retangulo(3, 5);
        formas.add(f3);

        for (int i=0; i<formas.size(); i++){
            System.out.println("\nForma"); 
            formas.get(i).getTipo();
            System.out.println("Área:" + formas.get(i).calcularArea() + "\nPerímetro:" + formas.get(i).calcularPerimetro());
        }
    }
}
