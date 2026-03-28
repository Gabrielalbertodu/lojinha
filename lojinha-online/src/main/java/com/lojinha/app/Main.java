package com.lojinha.app;

import com.lojinha.model.Cliente;
import com.lojinha.model.Pedido;
import com.lojinha.model.Produto;
import com.lojinha.model.ItemPedido;
import com.lojinha.service.LojaService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("SIMULAÇÃO");
        LojaService loja = new LojaService();

        // 1. Identificação de cliente
        Cliente cliente = loja.getClientes().get(0); // João Silva
        System.out.println("Cliente identificado: " + cliente.getNome());

        // 2. Listagem de produtos
        System.out.println("\nProdutos disponíveis:");
        for (Produto p : loja.getProdutos()) {
            System.out.println("- " + p.getNome() + ": R$ " + p.getPreco());
        }

        // 3. Seleção de produtos e criação de itens
        System.out.println("\nSelecionando produtos para o pedido");

        Produto p1 = loja.getProdutos().get(0);
        Produto p2 = loja.getProdutos().get(2);

        //  agora cria ItemPedido
        ItemPedido item1 = loja.criarItem(p1, 1);
        ItemPedido item2 = loja.criarItem(p2, 2);

        List<ItemPedido> itensSelecionados = new ArrayList<>();
        itensSelecionados.add(item1);
        itensSelecionados.add(item2);

        Pedido pedido = loja.criarPedido(cliente, itensSelecionados);
        System.out.println("Pedido criado: " + pedido);

        // 4. Processamento de pagamento
        System.out.println("\nIniciando processamento de pagamento");
        loja.processarPedido(pedido);

        System.out.println("\nStatus final do pedido: " + pedido.getStatus());
        System.out.println("FIM DA SIMULAÇÃO");
    }
}