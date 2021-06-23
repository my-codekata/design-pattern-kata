package br.com.adriano.strategy.loja.imposto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento, Imposto imposto);
}
