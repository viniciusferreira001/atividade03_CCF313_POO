package pacote_exercicio02;

public class bicicleta extends veiculo{

    private int numeroRodas;
    private float velocidade;
    
	@Override
	public int getNumeroRodas() {
		return numeroRodas;
	}

	@Override
	public void acelerar(float velocidade) {
		this.velocidade = velocidade;
		
	}

	@Override
	public void parar() {
		this.velocidade = 0;		
	}
    
}
