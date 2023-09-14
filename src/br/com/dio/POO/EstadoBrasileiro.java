package br.com.dio.POO;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO("MA", "Maranhão"),
    CEARA("CE", "Ceará");

    private String nome;
    private String sigla;

    EstadoBrasileiro(String sigla, String nome) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome(){

        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

    public void getNomeComSigla(){
        System.out.println(sigla + ", " + nome);
    }

}
