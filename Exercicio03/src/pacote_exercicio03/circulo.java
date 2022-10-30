package pacote_exercicio03;

public class circulo extends forma{
    
    private float raio;
    
    public circulo(float raio) {
        this.raio = raio;
    }

    @Override
    public float calcularArea() {
        return (float) (Math.PI * Math.pow(raio, 2));
    }

    @Override
    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    @Override
    public void getTipo() {
        System.out.println("Circulo");
    }
    
}
    

