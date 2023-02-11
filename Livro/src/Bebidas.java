public class Bebidas extends Objeto {

    private boolean alcolico;

    public Bebidas(String nome, int validade, boolean alcolico) {
        super(nome, validade);
        this.alcolico = alcolico;
    }

    public void beber() {
        if (this.alcolico = true) {
            System.out.println("Essa é a pior bebida que já vi na vida");
        } else {
            System.out.println("Essa é a melhor bebida que já vi na vida");
        }
        setValidade(0);
    }
}
