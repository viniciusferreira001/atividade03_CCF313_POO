package pacote_exercicio01;
import java.util.Scanner;

public class menu {
    Scanner ler = new Scanner(System.in);
    private int op;
    float resultado;
    int i=0;
    
    public void menu1() {
        while(true){
            if(i>0){
                System.out.println("O resultado eh: " + resultado);
            }
            System.out.println("Menu");
            System.out.println("1 - Calculadora");
            System.out.println("2 - Calculadora Cientifica");
            System.out.println("3 - Sair");
            op = getOp();
            if(op == 1){
                i++;
                calculadora c = new calculadora();
                menu2(c);
            
            }else if(op == 2){
                i++;
                calcu_cientifica cc = new calcu_cientifica();
                menu3(cc);
            }else if(op == 3){
                System.out.println("Saindo...");
                return;
            }else{
                System.out.println("Opção invalida");
                menu1();
            }
        }

    }
    private void menu2(calculadora c){
        System.out.println("Menu");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        op = getOp();

        if(op == 1){
            System.out.println("Digite o primeiro numero: ");
            float a = ler.nextFloat();
            System.out.println("Digite o segundo numero: ");
            float b = ler.nextFloat();
            resultado = c.soma(a, b);
        }else if(op == 2){
            System.out.println("Digite o primeiro numero: ");
            float a = ler.nextFloat();
            System.out.println("Digite o segundo numero: ");
            float b = ler.nextFloat();
            resultado = c.subtracao(a, b);
        }else if(op == 3){
            System.out.println("Digite o primeiro numero: ");
            float a = ler.nextFloat();
            System.out.println("Digite o segundo numero: ");
            float b = ler.nextFloat();
            resultado = c.multiplicacao(a, b);
        }else if(op == 4){
            System.out.println("Digite o primeiro numero: ");
            float a = ler.nextFloat();
            System.out.println("Digite o segundo numero: ");
            float b = ler.nextFloat();
            resultado = c.divisao(a, b);
        }else{
            System.out.println("Opção invalida");
            return;
        }

    }
    private void menu3(calcu_cientifica cc) {
        System.out.println("Menu");
        System.out.println("1 - Potencia");
        System.out.println("2 - Raiz");
        System.out.println("3 - Soma/Subtração/Multiplicação/Divisão");
        op = getOp();

        if(op == 1){
            System.out.println("Digite o primeiro numero: ");
            float a = ler.nextFloat();
            System.out.println("Digite o segundo numero: ");
            float b = ler.nextFloat();
            resultado = cc.potencia(a, b);
        }
        else if(op == 2){
            System.out.println("Digite o numero: ");
            float a = ler.nextFloat();
            resultado = cc.raiz(a);
        }else if(op == 3){
            menu2(cc);
        }
        else{
            System.out.println("Opção invalida");
            return;
        }
    }
    private int getOp() {
        return ler.nextInt();
    }

}
