package br.com.alura.loja.desconto.templatemethod;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    SemDesconto() {
        super(null);
    }

    @Override
    protected BigDecimal efeturaCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
