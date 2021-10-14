package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaNItens(new DescontoParaValor(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
