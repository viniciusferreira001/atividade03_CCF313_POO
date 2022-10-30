package pacote_exercicio04;

public class produto{
    public int serial;
    public int volume;
    public String estado = "não testado";
    int i=0;
    
    public produto(int serial){
        this.serial = serial;
    }
    public void chamaTestaUnidade(){
        if(i!=0){
            System.out.println("Unidade já testada");
        }else{
            testaUnidade();
            i++;
        }
    }
    private boolean testaUnidade(){
        float resultado = testar();
        alteraEstado(resultado);
        if(resultado < 0.9){
            return true;
        }
        else{
            return false;
        }
    }
    private float testar(){
        float resultado = (float) Math.random();
        System.out.printf("Resultado: %.2f\n", resultado);
        return resultado;
    }
    private void alteraEstado(float resultado){
        if (resultado < 0.9){
            estado = "aprovado";
        }
        else{
            estado = "reprovado";
        }
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public String toString(){
        return "Serial: " + serial + "\nVolume: " + volume + "\nEstado: " + estado;
    }
}