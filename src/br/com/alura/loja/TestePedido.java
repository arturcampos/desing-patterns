package br.com.alura.loja;

import br.com.alura.loja.pedido.observer.GeraPedido;
import br.com.alura.loja.pedido.observer.GeraPedidoHandler;
import br.com.alura.loja.pedido.observer.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.observer.acao.SalvarPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {

    public static void main(String[] args) {

        String cliente = "Gabriela";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler geradorHandler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedido(), new EnviarEmailPedido())
        );
        geradorHandler.executa(gerador);
    }
}
