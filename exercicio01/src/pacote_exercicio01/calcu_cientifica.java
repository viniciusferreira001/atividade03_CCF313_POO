package pacote_exercicio01;
import java.lang.Math;

public class calcu_cientifica extends calculadora{
    public float potencia(float a, float b){
        return (float) Math.pow(a, b);
    }
    public float raiz(float a){
        return (float)Math.sqrt(a);
    }
    
}
