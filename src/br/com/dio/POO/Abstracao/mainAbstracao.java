package br.com.dio.POO.Abstracao;

public class mainAbstracao {

    public static void main(String[] args) {

        ServicoMensagemInstantanea servico = new FacebookMessenger();
        servico.enviarMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();

    }
}
