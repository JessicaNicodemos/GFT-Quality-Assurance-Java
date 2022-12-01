package com.github.willyancaetano.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Classe apresentando mais detalhes das asserções
 */
public class ContaTest {

    @Test
    void validaSaldo() {
        Conta conta = new Conta("123456", 100);
        Assertions.assertNotNull(conta);

        conta.lancaCredito(50);

        Assertions.assertEquals(150, conta.getSaldo());

        conta.lancaDebito(50);

        Assertions.assertEquals(100, conta.getSaldo());

        Assertions.assertNotEquals(101, conta.getSaldo());

        conta = null;
        Assertions.assertNull(conta);
    }

}