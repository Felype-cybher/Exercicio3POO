package src;

public class Gatos extends Animal {
    public String raca;

    public Gatos(String nomeDoAnimal, String dono, String situacao, boolean vacinado, String tipoAtendimento, String raca) {
        super(nomeDoAnimal, dono, situacao, vacinado, tipoAtendimento);
        this.raca = raca;
    }


    @Override
    public String consultar() {
        return null;
    }


    public boolean vacinar(){
            if (getVacinado() == false){
                setVacinado(true);
                System.out.println("Cão foi vacinado");
            }else {
                System.out.println("Cão já está vacinado");
            }
            return getVacinado();
        }

    @Override
    public String exame() {
        return "";
    }
}


