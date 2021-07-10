package br.com.adriano.strategy.loja.desconto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getValor().compareTo(BigDecimal.valueOf(500.0)) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.2"));
        }
        return this.proximo.calcular(orcamento);
    }

}
