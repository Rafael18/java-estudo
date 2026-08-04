package edu.messenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        // System.out.println("############################# MSN Messenger #############################");
        // System.out.println("\n");
        // MSNMensseger msn = new MSNMensseger();
        // msn.enviarMensagem();
        // msn.receberMensagem();
        // System.out.println("\n");

        // System.out.println("############################# Facebook Messenger #############################");
        // System.out.println("\n");
        // FacebookMessenger facebook = new FacebookMessenger();
        // facebook.enviarMensagem();
        // facebook.receberMensagem();
        // System.out.println("\n");

        // System.out.println("############################# Telegram #############################");
        // System.out.println("\n");
        // Telegram telegram = new Telegram();
        // telegram.enviarMensagem();
        // telegram.receberMensagem();

        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "Facebook";

        if (appEscolhido.equals("MSN")) {
            smi = new MSNMensseger();
        } else if (appEscolhido.equals("Facebook")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("Telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
 