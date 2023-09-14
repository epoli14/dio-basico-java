package br.com.dio.POO;

public class SistemaIBGE {

    public static void main(String[] args) {

        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + ", " + e.getNomeMaiusculo());
        }

        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        eb.getNomeComSigla();

    }

}
