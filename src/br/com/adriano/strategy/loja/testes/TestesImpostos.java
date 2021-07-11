package br.com.adriano.strategy.loja.testes;

import br.com.adriano.strategy.loja.imposto.CalculadoraDeImpostos;
import br.com.adriano.strategy.loja.imposto.ImpostoICMS;
import br.com.adriano.strategy.loja.imposto.ImpostoISS;
import br.com.adriano.strategy.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        ImpostoICMS impostoICMS = new ImpostoICMS();
        ImpostoISS impostoISS = new ImpostoISS();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, impostoICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, impostoISS));
    }
}
