package br.com.adriano.testes;

import br.com.adriano.loja.imposto.TipoImposto;
import br.com.adriano.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoIMposto) {
        switch (tipoIMposto) {
            case ICMS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(0.1));
            case ISS:
                return orcamento.getValor().multiply(BigDecimal.valueOf(0.06));
            default:
                return BigDecimal.ZERO;
        }
    }
}