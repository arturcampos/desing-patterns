package br.com.alura.loja.desconto.templatemethod;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class DescontoParaNItens extends Desconto {

    DescontoParaNItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efeturaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
