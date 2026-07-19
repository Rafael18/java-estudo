package edu.lanchonete;

import edu.lanchonete.area.atendimento.Atendente;
import edu.lanchonete.area.atendimento.cozinha.*;
import edu.lanchonete.area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();
        
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        atendente.servindoMesa();
        atendente.receberPagamento();

        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
    }
}
