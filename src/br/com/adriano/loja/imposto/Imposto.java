package br.com.adriano.loja.imposto;

import br.com.adriano.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcular(Orcamento orcamento, Imposto imposto);
}
