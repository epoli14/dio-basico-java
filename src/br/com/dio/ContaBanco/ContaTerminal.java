package br.com.dio.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero = 0;
        String agencia, nomeCliente;
        double saldo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o valor do primeiro depósito!");
        saldo = scanner.nextDouble();

        informacoesCliente(numero, agencia, nomeCliente, saldo);
    }

    public static void informacoesCliente(int numero, String agencia, String nomeCliente, double saldo){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar um conta em nosso banco, sua agência é " + agencia + " conta " + numero
        + " e seu saldo de R$ " + saldo + " já está disponível para saque." );
    }

}
