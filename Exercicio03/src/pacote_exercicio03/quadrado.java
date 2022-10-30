package pacote_exercicio03;

public class quadrado extends forma{
    
    private float lado;
    
    public quadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        return lado * lado;
    }

    @Override
    public float calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    public void getTipo() {
        System.out.println("Quadrado");
    }
    
}
