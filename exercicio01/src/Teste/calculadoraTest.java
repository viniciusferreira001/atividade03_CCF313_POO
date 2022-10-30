package Teste;
import org.junit.Test;
import org.junit.Assert;
import pacote_exercicio01.calcu_cientifica;

public class calculadoraTest {
    calcu_cientifica cc = new calcu_cientifica();
    
    @Test
    public void testSoma() {
        Assert.assertEquals((float)9.0f, cc.soma((float)7.0, (float)2.0), (float)0.0002f);
    }
    @Test
    public void testSubtracao() {
        Assert.assertEquals((float)5.0f, cc.subtracao((float)7.0, (float)2.0), (float)0.0002f);
    }
    @Test
    public void testMultiplicacao() {
        Assert.assertEquals((float)14.0f, cc.multiplicacao((float)7.0, (float)2.0), (float)0.0002f);
    }
    @Test
    public void testDivisao() {
        Assert.assertEquals((float)3.5f, cc.divisao((float)7.0, (float)2.0), (float)0.0002f);
    }
    @Test
    public void testPotencia() {
        Assert.assertEquals((float)49.0f, cc.potencia((float)7.0, (float)2.0), (float)0.0002f);
    }
    @Test
    public void testRaiz() {
        Assert.assertEquals((float)2.6458f, cc.raiz((float)7.0), (float)0.0002f);
    }
}
