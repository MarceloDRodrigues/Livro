public class Personagem {
    private String nome;
    private int vida;
    private int forca;

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void exibirStatus() {
        System.out
                .println("Os seus status são: Nome: " + this.nome + ", vida: " + this.vida + ", forca: " + this.forca);
    }
}
