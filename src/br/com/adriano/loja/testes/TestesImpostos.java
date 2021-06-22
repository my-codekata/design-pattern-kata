package br.com.adriano.loja.testes;

import br.com.adriano.loja.imposto.CalculadoraDeImpostos;
import br.com.adriano.loja.imposto.ImpostoICMS;
import br.com.adriano.loja.imposto.ImpostoISS;
import br.com.adriano.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        ImpostoICMS impostoICMS = new ImpostoICMS();
        ImpostoISS impostoISS = new ImpostoISS();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, impostoICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, impostoISS));
    }
}
