public class Escolha {
    private String texto;
    private Capitulo proximo;
    

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Capitulo getProximo() {
        return proximo;
    }

    public void setProximo(Capitulo proximo) {
        this.proximo = proximo;
    }

    public Escolha() {
    }

    public Escolha(String texto, Capitulo proximo) {
        this.texto = texto;
        this.proximo = proximo;
    }

    public void adicionar(String texto, Capitulo proximo){
        this.texto = texto;
        this.proximo = proximo;
    }
}
