package br.com.adriano.strategy.carrinhocompras;

import br.com.adriano.strategy.carrinhocompras.model.CarrinhoDeCompras;
import br.com.adriano.strategy.carrinhocompras.model.DescontoBlackFriday;
import br.com.adriano.strategy.carrinhocompras.model.DescontoPadrao;
import br.com.adriano.strategy.carrinhocompras.model.Produto;

import java.math.BigDecimal;

public class CarrinhoDeComprasTeste {

    public static void main(String[] args) {
        Produto produtoB = new Produto("b", new BigDecimal("15"));
        Produto produtoC = new Produto("c", new BigDecimal("25"));
        Produto produtoA = new Produto("a", new BigDecimal("10"));

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(new DescontoPadrao());
        carrinhoDeCompras.adicionaProduto(produtoA);
        carrinhoDeCompras.adicionaProduto(produtoB);
        carrinhoDeCompras.adicionaProduto(produtoC);

        System.out.println("10% de desconto =========================");
        carrinhoDeCompras.adicionaProduto(new Produto("d", new BigDecimal("50")));
        System.out.println(carrinhoDeCompras.getTotal());
        System.out.println(carrinhoDeCompras.getTotalComDesconto());

        System.out.println("20% de desconto =========================");
        carrinhoDeCompras.adicionaProduto(new Produto("d", new BigDecimal("100")));
        System.out.println(carrinhoDeCompras.getTotal());
        System.out.println(carrinhoDeCompras.getTotalComDesconto());

        System.out.println("30% de desconto =========================");
        carrinhoDeCompras.adicionaProduto(new Produto("d", new BigDecimal("100")));
        System.out.println(carrinhoDeCompras.getTotal());
        System.out.println(carrinhoDeCompras.getTotalComDesconto());

        System.out.println("25% de desconto black friday =========================");
        CarrinhoDeCompras carrinhoBlack = new CarrinhoDeCompras(new DescontoBlackFriday());
        carrinhoBlack.adicionaProduto(produtoC);
        carrinhoBlack.adicionaProduto(produtoC);
        carrinhoBlack.adicionaProduto(produtoC);
        carrinhoBlack.adicionaProduto(produtoC);
        carrinhoBlack.adicionaProduto(produtoA);
        System.out.println(carrinhoBlack.getTotal());
        System.out.println(carrinhoBlack.getTotalComDesconto());

    }
}
