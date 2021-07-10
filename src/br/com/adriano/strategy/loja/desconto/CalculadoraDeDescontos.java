package br.com.adriano.strategy.loja.desconto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaMaisDeCincoItens();
        DescontoParaOrcamentoComValorMaiorQueQuinhentos descontoParaOrcamentoComValorMaiorQueQuinhentos = new DescontoParaOrcamentoComValorMaiorQueQuinhentos();
        SemDesconto semDesconto = new SemDesconto();

        desconto.adicionarRegraDeDesconto(descontoParaOrcamentoComValorMaiorQueQuinhentos)
                .adicionarRegraDeDesconto(semDesconto);
        return desconto.calcular(orcamento);
    }

}
