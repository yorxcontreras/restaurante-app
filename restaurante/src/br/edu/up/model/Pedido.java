package br.edu.up.model;

import java.util.List;

public class Pedido {
    private List<Produto> produtos;
    private double total;

    public Pedido(List<Produto> produtos, double total) {
        this.produtos = produtos;
        this.total = total;
    }

}