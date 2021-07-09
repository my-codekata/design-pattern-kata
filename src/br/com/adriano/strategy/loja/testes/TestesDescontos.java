package br.com.adriano.strategy.loja.testes;

import br.com.adriano.strategy.loja.desconto.CalculadoraDeDescontos;
import br.com.adriano.strategy.loja.imposto.CalculadoraDeImpostos;
import br.com.adriano.strategy.loja.imposto.ImpostoICMS;
import br.com.adriano.strategy.loja.imposto.ImpostoISS;
import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("600"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(orcamento));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}
