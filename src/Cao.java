package src;

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

    @Override
    public String consultar() {
        exame();
        if (getVacinado() == false) {
            vacinar();
        }
        return consultar();

    }

    public boolean vacinar() {
        if (getVacinado() == false) {
            setVacinado(true);
            System.out.println("Cão foi vacinado");
        } else {
            System.out.println("Erro! Cão já está vacinado");
        }
        return getVacinado();
    }

    public String exame() {
        if (getVacinado() == true) {
            System.out.println("O animal já esta em ótimas condições");
        }else {
            System.out.println("O animal precisa estar com a vacina em dia!");
        }
        return exame();
    }
}
