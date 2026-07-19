package edu.lanchonete.area.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }

    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
    }

    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }

    private void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, PRESUNTO, QUEIJO E SALADA");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA , LEITE E AÇÚCAR");
    }

    private void lavarIngredientes(){
        System.out.println("LAVANDO OS INGREDIENTES");
    }

    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O LANCHE");
    }

    private void baterVitaminaLiquificador(){
        System.out.println("BATENDO A VITAMINA");
    }

    private void pedirParaTrocarGas(Almoxarife meuAmido){
        meuAmido.trocarGas();
    }

    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}