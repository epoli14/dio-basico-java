package br.com.dio.EstruturaExcepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Tratamento_De_Excecoes {

    public static void main(String[] args) {

        String nome, ultimoNome;
        int idade = 0;
        float altura = 0;

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.println("Digite seu nome");
            nome = scanner.nextLine();

            System.out.println("Digite seu último nome");
            ultimoNome = scanner.nextLine();

            System.out.println("Digite sua idade");
            idade = scanner.nextInt();

            System.out.println("Digite sua altura");
            altura = scanner.nextFloat();

        } catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }

    }

    public static void aboutMe(String nome, String ultimoNome, int idade, float altura){

        System.out.println("Nome: " + nome + " " + ultimoNome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);

    }

}
