package br.com.alura.loja.desconto.templatemethod;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(deveAplicar(orcamento)){
            return efeturaCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }
    protected abstract BigDecimal efeturaCalculo(Orcamento orcamento);

    public abstract Boolean deveAplicar(Orcamento orcamento);
}
