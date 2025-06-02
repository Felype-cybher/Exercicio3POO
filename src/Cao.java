public class Cao extends Animal {
    private String raca;

    public Cao(String nomeDoAnimal, String dono, String situacao, boolean vacinado, String tipoAtendimento, String raca) {
        super(nomeDoAnimal, dono, situacao, vacinado, tipoAtendimento);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String consultar(){
        return null;
    }

    public String vacinar(){
        return null;
    }

    public String exame(){
        return null;
    }
}