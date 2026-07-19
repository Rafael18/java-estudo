package edu.estados;

public enum EstadoBrasileiro {
    PARA("PA", "Pará", 11),
    PARAIBA("PB", "Paraíba", 12),
    PARANA("PR", "Paraná", 13),
    PERNAMBUCO("PE", "Pernambuco", 14),
    CEARA("CE", "Ceará", 15);
 
    
    private String nome;
    private String sigla;
    private int ibge;

    EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge(){
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}