package edu.interfaces.equipamentos.multifucional;

import edu.interfaces.equipamentos.copiadora.Copiadora;
import edu.interfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.interfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional  implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("Copiando via Multifuncional...");
    }

    @Override
    public void digitalizar() {
        System.out.println("Digitalizando via Multifuncional...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo via Multifuncional...");
    }
    
}
