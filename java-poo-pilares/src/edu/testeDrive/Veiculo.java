package edu.testeDrive;

public abstract class Veiculo {
    private String chassi;

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar();
}
