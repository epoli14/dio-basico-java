package br.com.dio.EstruturaExcepcionais;

public class FormatadorCepEvento {

    public static void main(String[] args) {

        String cepformatado = null;
        try {
            cepformatado = formatarCEP("14234220");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde com a regra de negócio");;
        }


    }

    public static String formatarCEP(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "Modelo: 23.765-064";
    }
}
