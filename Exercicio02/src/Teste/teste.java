package Teste;
import org.junit.Test;

import pacote_exercicio02.automovel;
import java.util.Calendar;
import org.junit.Assert;

public class teste {
    automovel carro = new automovel();

    @Test
    public void teste1() {
        assertDatesEqual(Calendar.getInstance(), carro.dataOleo);
    }

    private void assertDatesEqual(Calendar instance, Calendar dataOleo) {
        Assert.assertEquals(instance.get(Calendar.YEAR), dataOleo.get(Calendar.YEAR));
        Assert.assertEquals(instance.get(Calendar.MONTH), dataOleo.get(Calendar.MONTH));
        Assert.assertEquals(instance.get(Calendar.DAY_OF_MONTH), dataOleo.get(Calendar.DAY_OF_MONTH));
    }

}
