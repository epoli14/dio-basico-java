package br.com.dio.Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoJurosCompostos {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        //df.applyPattern("R$ #,##0.00");

        double valorInicial = scanner.nextDouble();


        double taxaJuros = scanner.nextDouble();
        taxaJuros /= 100;

        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;


        /*TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.
         M = C * (1 + i) ^t
         C = valorInicial
         i = taxa juros
         t = periodo
        */
        valorFinal = valorFinal * Math.pow((1 + taxaJuros), periodo);

        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }
}
