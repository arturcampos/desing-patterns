package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class DescontoParaNItens extends Desconto{

    DescontoParaNItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeItens() > 5){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}