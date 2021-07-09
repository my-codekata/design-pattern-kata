package br.com.adriano.strategy.carrinhocompras.model;

import java.math.BigDecimal;

public class DescontoBlackFriday implements DescontoStrategy {
    @Override
    public BigDecimal getDesconto(CarrinhoDeCompras carrinhoDeCompras) {
        if (carrinhoDeCompras.getTotal().compareTo(new BigDecimal("100")) > 0) {
            return new BigDecimal("0.75");
        }
        return BigDecimal.ZERO;
    }
}
