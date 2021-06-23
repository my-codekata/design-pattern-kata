package br.com.adriano.strategy.loja.imposto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostoICMS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
    }
}
