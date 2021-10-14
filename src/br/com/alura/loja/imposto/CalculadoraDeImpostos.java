package br.com.alura.loja.imposto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

//strategy design pattern
public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
       return imposto.calcular(orcamento);

    }
}
