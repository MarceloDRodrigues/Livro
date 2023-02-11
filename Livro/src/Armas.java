public class Armas extends Objeto {

    private int dano;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public Armas(String nome, int validade, int dano) {
        super(nome, validade);
        this.dano = dano;
    }

    public void atacar(Personagem alvo) {

        System.out.println(this.getNome() + "ataca e dá " + getDano() + "de dano");
        int alvo_vida = alvo.getVida() - dano;
        alvo.setVida(alvo_vida);
        if (alvo_vida < 0) {
            alvo.morrer();
        }
    }

    Armas espadaKarine = new Armas("Fiodor", 120, 5);
}
