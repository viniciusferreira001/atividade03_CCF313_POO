package pacote_exercicio03;

public class retangulo extends forma{
    
    private float lado;
    private float altura;
    
    public retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }
    @Override
    public float calcularArea() {
        return lado * altura;
    }
    @Override
    public float calcularPerimetro() {
        return 2 * (lado + altura);
    }
    @Override
    public void getTipo() {
        System.out.println("Retangulo");
    }
    
}
