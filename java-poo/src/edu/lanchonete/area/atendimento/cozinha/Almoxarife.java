package edu.lanchonete.area.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("CONTROLANDO A ENTRADA DE MERCADORIAS");
    }

    private void controlarSaida(){
        System.out.println("CONTROLANDO A SAÍDA DE MERCADORIAS");
    }

    void entregarIngredientes(){
        System.out.println("ENTREGANDO INGREDIENTES PARA O COZINHEIRO");
        controlarSaida();
    }

    void trocarGas(){
        System.out.println("ALMOXARIFE TROCANDO O GÁS");
    }
}
