package br.com.adriano.loja.testes;

import br.com.adriano.loja.imposto.TipoImposto;
import br.com.adriano.loja.orcamento.Orcamento;
import br.com.adriano.testes.CalculadoraDeImpostos;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
    }
}
