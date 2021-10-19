package br.com.alura.loja.desconto.chainofresponsability;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaNItens(new DescontoParaValor(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
