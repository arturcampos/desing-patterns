package br.com.alura.loja.desconto.templatemethod;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class DescontoParaValor extends Desconto {

    DescontoParaValor(Desconto proximo) {
        super(proximo);
    }

    @Override
    protected BigDecimal efeturaCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
