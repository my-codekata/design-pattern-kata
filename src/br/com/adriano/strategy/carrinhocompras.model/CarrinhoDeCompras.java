package br.com.adriano.strategy.carrinhocompras.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> produtos;
    private BigDecimal desconto = BigDecimal.ZERO;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
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

        if (total.compareTo(BigDecimal.valueOf(100)) >= 0 && total.compareTo(BigDecimal.valueOf(200)) < 0) {
            this.desconto = new BigDecimal("0.9");
        } else if (total.compareTo(BigDecimal.valueOf(200)) >= 0 && total.compareTo(BigDecimal.valueOf(300)) < 0) {
            this.desconto = new BigDecimal("0.8");
        } else if(total.compareTo(BigDecimal.valueOf(300)) >= 0) {
            this.desconto = new BigDecimal("0.7");
        }
        return total.multiply(desconto);
    }
}
