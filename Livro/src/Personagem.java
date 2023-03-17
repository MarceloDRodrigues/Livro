public class Personagem {
    private String nome;
    private int vida;
    private int forca;
    private int energia = 100;

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

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

    

    public Personagem(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void alteracaoEnergia(int valor){
        if (this.energia>0){
        this.energia -= valor;
    }else{
        System.out.println("A energia não pode ser menor que 0.");
    }
    }

    public void exibirStatus() {
        System.out
                .println("Os seus status são: Nome: " + this.nome + ", vida: " + this.vida + ", forca: " + this.forca);
    }

    
}
