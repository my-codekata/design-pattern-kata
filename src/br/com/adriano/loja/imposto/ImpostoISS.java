package br.com.adriano.loja.imposto;

import br.com.adriano.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ImpostoISS implements Imposto {
    @Override
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
    }
}