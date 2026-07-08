package edu.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartRTv smartRTv = new SmartRTv();
        
        System.out.println("TV ligada: " + smartRTv.ligada);
        System.out.println("Canal atual: " + smartRTv.canal);
        System.out.println("Volume atual: " + smartRTv.volume);

        smartRTv.ligar();
        System.out.println("TV ligada: " + smartRTv.ligada);

        smartRTv.desligar();
        System.out.println("TV ligada: " + smartRTv.ligada);

        smartRTv.aumentarVolume();
        smartRTv.aumentarVolume();
        smartRTv.aumentarVolume();
        smartRTv.aumentarVolume();
        System.out.println("Volume atual: " + smartRTv.volume);

        smartRTv.diminuirVolume();
        smartRTv.diminuirVolume();
        System.out.println("Volume atual: " + smartRTv.volume);

        smartRTv.mudarCanal(10);
        System.out.println("Canal atual: " + smartRTv.canal);

        smartRTv.aumentarCanal();
        smartRTv.aumentarCanal();
        smartRTv.aumentarCanal();
        smartRTv.aumentarCanal();
        System.out.println("Canal atual: " + smartRTv.canal);

        smartRTv.diminuirCanal();
        System.out.println("Canal atual: " + smartRTv.canal);
    }
}
