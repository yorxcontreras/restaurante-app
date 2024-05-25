package br.edu.up.model;

public class Delivery {
    private String enderecoEntrega;
    private Pedido pedido;

    public Delivery(String enderecoEntrega, Pedido pedido) {
        this.enderecoEntrega = enderecoEntrega;
        this.pedido = pedido;
    }

}