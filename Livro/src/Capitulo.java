import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    Personagem personagem;
    int alteracaoEnergia;
    ArrayList<Escolha> escolhas;

    public Capitulo(String nome, String texto,
            Personagem personagem) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
      

    }
   

    public void executar(){
        System.out.println("Canso");
        boolean condicao = escolhas != null;
        Capitulo atual = this;
        while(condicao){
        
        if (!condicao){
            System.out.println("O jogo chegou ao fim. Parabéns por ter completado.");
        }else{
            System.out.println("KKKFKFKFK");
            atual.mostrar();
            int escolhaTemp = atual.escolher();
            atual = atual.escolhas.get(escolhaTemp).getProximo();
            
            //escolha.getProximo é um capitulo.
           
        }
        }
        }
    
        public void mostrar() {       
            System.out.println(this.texto);

            }
        

    public int escolher() {
        int escolha = 100;
        try{
        Scanner escaneador = new Scanner(System.in);
        for (int i = 0; i < escolhas.size(); i++){
       
        System.out.println(  this.escolhas.get(i).getTexto());
        }
        escolha = escaneador.nextInt();
        
        boolean condicao = (escolha == 1 || escolha == 0);
        if ((condicao) == false) {
            while ((condicao) == false) {
                System.out.println("A escolha " + escolha + " é inválida, digite 0 ou 1, de acordo com a sua decisão.");
                escolha = escaneador.nextInt();
            }
            escaneador.close();

        }}
        catch(NullPointerException e){
            e.printStackTrace();
        } 
        
        return escolha;
        
      }
}
