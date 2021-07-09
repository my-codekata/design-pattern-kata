package br.com.adriano.strategy.carrinhocompras.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private  DescontoStrategy desconto;

    public CarrinhoDeCompras(DescontoStrategy tipoDeDesconto) {
        this.produtos = new ArrayList<>();
        this.desconto = tipoDeDesconto;
    }

    public void adicionaProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public List<Produto> getProdutos(Produto produto) {
        return this.produtos;
    }

    public BigDecimal getTotal() {
        return this.produtos.stream()
                .map(Produto::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getTotalComDesconto() {
        BigDecimal total = this.getTotal();
        BigDecimal desconto = this.desconto.getDesconto(this);
        return total.multiply(desconto);
    }
}
