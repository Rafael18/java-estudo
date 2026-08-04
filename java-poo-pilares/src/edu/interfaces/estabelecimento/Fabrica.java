package edu.interfaces.estabelecimento;

import edu.interfaces.equipamentos.impressora.Deskjet;
import edu.interfaces.equipamentos.impressora.Impressora;
import edu.interfaces.equipamentos.multifucional.EquipamentoMultifuncional;
import edu.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.interfaces.equipamentos.copiadora.Copiadora;

public class Fabrica {
    public static void main(String[] args) {
        // Impressora impressora = new Deskjet();
        // impressora.imprimir();

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        em.imprimir();
        em.digitalizar();
        em.copiar();

        // Polimorfismo
        // Todos os obetos abaixo são do tipo EquipamentoMultifuncional, mas cada um se comporta de maneira diferente
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
