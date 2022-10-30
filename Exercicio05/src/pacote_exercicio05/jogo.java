package pacote_exercicio05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class jogo {
    List<objeto> objetos = Arrays.asList(new pedra(), new papel(), new tesoura());
    public List<objeto> escolheAleatorio(){
        
        Collections.shuffle(objetos);
        return objetos;
    }
    public void jogar(){
        List<objeto> objetos = escolheAleatorio();
        objeto objeto1 = objetos.get(0);
        objeto objeto2 = objetos.get(1);
        System.out.println("Jogador 1 escolheu: " + objeto1.getNome());
        System.out.println("Jogador 2 escolheu: " + objeto2.getNome());
        
        if(objeto1.getNome().equals(objeto2.getNome())){
            System.out.println("Empate");
        }
        else if(objeto1.getNome().equals("pedra") && objeto2.getNome().equals("tesoura")){
            System.out.println("Jogador 1 venceu");
        }
        else if(objeto1.getNome().equals("pedra") && objeto2.getNome().equals("papel")){
            System.out.println("Jogador 2 venceu");
        }
        else if(objeto1.getNome().equals("papel") && objeto2.getNome().equals("pedra")){
            System.out.println("Jogador 1 venceu");
        }
        else if(objeto1.getNome().equals("papel") && objeto2.getNome().equals("tesoura")){
            System.out.println("Jogador 2 venceu");
        }
        else if(objeto1.getNome().equals("tesoura") && objeto2.getNome().equals("pedra")){
            System.out.println("Jogador 2 venceu");
        }
        else if(objeto1.getNome().equals("tesoura") && objeto2.getNome().equals("papel")){
            System.out.println("Jogador 1 venceu");
        }
    }
}
