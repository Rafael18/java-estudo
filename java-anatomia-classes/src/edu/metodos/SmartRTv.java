package edu.metodos;

public class SmartRTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 100) {
            canal = novoCanal;
        }
    }

    public void aumentarCanal() {
        if (canal < 100) {
            canal++;
        } else {
            canal = 1; // Volta para o canal 1 se estiver no canal 100
        }
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 100; // Vai para o canal 100 se estiver no canal 1
        }
    }
}