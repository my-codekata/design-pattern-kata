package br.com.adriano.strategy.carrinhocompras.model;

import java.math.BigDecimal;

public class DescontoPadrao implements DescontoStrategy {

    @Override
    public BigDecimal getDesconto(CarrinhoDeCompras carrinhoDeCompras) {
        BigDecimal total = carrinhoDeCompras.getTotal();
        if (total.compareTo(BigDecimal.valueOf(100)) >= 0 && total.compareTo(BigDecimal.valueOf(200)) < 0) {
            return new BigDecimal("0.9");
        } else if (total.compareTo(BigDecimal.valueOf(200)) >= 0 && total.compareTo(BigDecimal.valueOf(300)) < 0) {
            return new BigDecimal("0.8");
        } else if(total.compareTo(BigDecimal.valueOf(300)) >= 0) {
            return new BigDecimal("0.7");
        }
        return BigDecimal.ZERO;
    }
}
