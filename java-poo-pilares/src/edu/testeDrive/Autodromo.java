package edu.testeDrive;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456789");
        jeep.ligar();

        Moto lander = new Moto();
        lander.setChassi("987654321");
        lander.ligar();

    }
}