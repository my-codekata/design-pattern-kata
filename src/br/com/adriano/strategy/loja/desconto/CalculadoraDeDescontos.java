package br.com.adriano.strategy.loja.desconto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }
        return BigDecimal.ZERO;
    }

}
