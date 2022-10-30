package Teste;
import org.junit.Test;

import pacote_exercicio02.automovel;

import static org.junit.Assert.assertArrayEquals;

import java.util.Calendar;

import org.junit.Assert;
//import org.junit.Before;

public class teste {
    automovel carro = new automovel();
    
    //@Before
    //carro.trocarOleo();


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
