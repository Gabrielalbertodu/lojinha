package com.lojinha.model;

public class ItemPedido {
    private int id;
    private Produto produto;
    private int quantidade;
    private double precoUnitario;

    public ItemPedido(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = produto.getPreco();
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}