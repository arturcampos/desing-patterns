package br.com.alura.loja.pedido.observer.acao;

import br.com.alura.loja.pedido.observer.Pedido;

public class SalvarPedido implements AcaoPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedidono banco de dados");
    }
}
