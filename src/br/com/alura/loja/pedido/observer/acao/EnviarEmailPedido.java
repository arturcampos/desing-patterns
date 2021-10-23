package br.com.alura.loja.pedido.observer.acao;

import br.com.alura.loja.pedido.observer.Pedido;

public class EnviarEmailPedido implements AcaoPedido{

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando dados do pedido");
    }
}
