package br.com.adriano.strategy.loja.imposto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento, imposto);
    }
}
