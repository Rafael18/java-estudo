package edu.criandoExcecao;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException("CEP inválido: " + cep);

        return "23.765-064";
    }
}
