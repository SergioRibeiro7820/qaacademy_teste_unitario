package qacademy_test_exercicio;

import org.junit.Test;
import org.junit.Assert;

public class Teste_ex01 {
    @Test
    public void validaPalavra(){
        Assert.assertEquals("bom dia",Ex01.retornaPalavra()); 
    }
    //Assert bibliteca que compara dois valores.
    
    @Test
    public void validaPalavraIncorreta(){
        Assert.assertEquals("não",Ex01.retornaPalavra());
    }
}
