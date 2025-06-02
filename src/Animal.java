public abstract class Animal {

    public String nomeDoAnimal;
    public String dono;
    private static int numProcedimentos;
    // private double valorAtendimento;
    private String situacao;
    private boolean vacinado;
    public String tipoAtendimento;

    public Animal(String nomeDoAnimal, String dono, String situacao, boolean vacinado, String tipoAtendimento) {
        this.nomeDoAnimal = nomeDoAnimal;
        this.dono = dono;
        this.situacao = situacao;
        this.vacinado = vacinado;
        this.tipoAtendimento = tipoAtendimento;
    }

    public static int getNumProcedimentos() {
        return numProcedimentos;
    }

    public static void setNumProcedimentos(int numProcedimentos) {
        Animal.numProcedimentos = numProcedimentos;
    }


    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public boolean getVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public abstract String consultar();

    public abstract String vacinar();

    public abstract String exame();

}
