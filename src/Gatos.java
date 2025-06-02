public class Gatos extends Animal {
    public String raca;

    public Gatos(String nomeDoAnimal, String dono, String situacao, boolean vacinado, String tipoAtendimento, String raca) {
        super(nomeDoAnimal, dono, situacao, vacinado, tipoAtendimento);
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
