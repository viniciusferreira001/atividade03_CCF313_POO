package pacote_exercicio02;

import java.util.Calendar;

public class automovel extends veiculo{
    public Calendar dataOleo = Calendar.getInstance();
    private int numeroRodas;
    private float velocidade;

    public void trocarOleo(){
        Calendar dataAtual = Calendar.getInstance();
        this.dataOleo = dataAtual;
    }

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
