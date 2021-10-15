package br.com.alura.loja;

import br.com.alura.loja.desconto.chainofresponsability.CalculadoraDeDescontos;
import br.com.alura.loja.desconto.templatemethod.CalculadoraDeDescontosV2;
import br.com.alura.loja.imposto.strategy.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.strategy.ICMS;
import br.com.alura.loja.imposto.strategy.ISS;

import java.math.BigDecimal;

public class Loja {

    public static void main(String[] args){
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println("Desconto orcamento 1: " + calculadoraDeDescontos.calcular(orcamento1));
        System.out.println("Desconto orcamento 2: " + calculadoraDeDescontos.calcular(orcamento2));

        CalculadoraDeDescontosV2 calculadoraDeDescontosV2 = new CalculadoraDeDescontosV2();
        System.out.println("Desconto v2 orcamento 1: " + calculadoraDeDescontos.calcular(orcamento1));
        System.out.println("Desconto v2 orcamento 2: " + calculadoraDeDescontos.calcular(orcamento2));



        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println("ICMS orcamento 1: " + calculadoraDeImpostos.calcular(orcamento1, new ICMS()));
        System.out.println("ISS orcamento 1: " + calculadoraDeImpostos.calcular(orcamento1, new ISS()));
        System.out.println("ICMS orcamento 2: " + calculadoraDeImpostos.calcular(orcamento2, new ICMS()));
        System.out.println("ISS orcamento 2: " + calculadoraDeImpostos.calcular(orcamento2, new ISS()));
    }
}
