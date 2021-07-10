package br.com.adriano.strategy.loja.desconto;

import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

     public Desconto adicionarRegraDeDesconto(Desconto desconto) {
        this.proximo = desconto;
        return this.proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
