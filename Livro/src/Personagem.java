public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private Armas objetoDeDefesa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public Armas getObjetoDeDefesa() {
        return objetoDeDefesa;
    }

    public void setObjetoDeDefesa(Armas objetoDeDefesa) {
        this.objetoDeDefesa = objetoDeDefesa;
    }

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.objetoDeDefesa = objetoDeDefesa;
    }

    public void exibirStatus() {
        System.out
                .println("Os seus status são: Nome: " + this.nome + ", vida: " + this.vida + ", forca: " + this.forca);
    }

    public void morrer() {
        System.out.println(getNome() + " morreu.");
    }
}
