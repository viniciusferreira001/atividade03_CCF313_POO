import java.util.Scanner;

import pacote_exercicio05.jogo;

public class App {
    public static void main(String[] args) throws Exception {
        jogo j1 = new jogo();
        Scanner opcao = new Scanner(System.in);
        while(true){
            j1.jogar();
            System.out.println("Digite 0 para sair, qualquer outro número para continuar:");
            int escolha = opcao.nextInt();
            if(escolha == 0){
                break;
            }
        }
        opcao.close();
    }
}
