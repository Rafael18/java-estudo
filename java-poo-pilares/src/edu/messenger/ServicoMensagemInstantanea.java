package edu.messenger;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se o computador está conectado à internet...");
    }

}
