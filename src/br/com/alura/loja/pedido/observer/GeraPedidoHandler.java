package br.com.alura.loja.pedido.observer;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.observer.acao.AcaoPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoPedido> acoes;

    public GeraPedidoHandler(List<AcaoPedido> acoes) {
        this.acoes = acoes;
    }

    //construtor com injeção de dependencias: repository, service, etc

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
