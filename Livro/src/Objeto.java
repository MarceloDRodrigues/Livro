public class Objeto {

    private String nome;
    private int validade;

    public Objeto(String nome, int validade) {
        this.nome = nome;
        this.validade = validade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

}
