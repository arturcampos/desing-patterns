package br.com.alura.loja.desconto.templatemethod;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontosV2 {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaNItens(new DescontoParaValor(new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}
