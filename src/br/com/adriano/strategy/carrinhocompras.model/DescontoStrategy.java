package br.com.adriano.strategy.carrinhocompras.model;

import java.math.BigDecimal;

public interface DescontoStrategy {
    public BigDecimal getDesconto(CarrinhoDeCompras carrinhoDeCompras);
}
