import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    public String nome;
    private String texto;
    public Personagem personagem;
    public ArrayList<Escolha> escolhas;

    public Capitulo(String nome, String texto,
            Personagem personagem) {
        this.nome = nome;
        this.texto = texto;
        this.personagem = personagem;
         
    }
   

    public void executar(){
        try{
        boolean condicao = (escolhas != null);
        Capitulo atual = this;
        while(condicao){
        
        if (condicao){
            lerArquivo();
            atual.mostrar();
            int escolhaTemp = atual.escolher(); 
            atual = atual.escolhas.get(escolhaTemp).getProximo();
            atual.personagem.alteracaoEnergia(20);
            }
           
        }
        }
    catch(NullPointerException e){
        System.out.println("O jogo chegou ao fim. Parabéns por ter completado.");
    }
}
        
    
        public void mostrar() {  
                            

            System.out.println("Titulo: "+ this.nome);     
            System.out.println(this.texto);

            }
        

    private void lerArquivo() {
        try( BufferedReader leitorArquivo = new BufferedReader(new FileReader("rsc/conteudocapitulos.txt"))){
           
            String linha;
            System.out.println("Cams");            
            while((linha = leitorArquivo.readLine()) != null){
                System.out.println(linha);
                System.out.println("Entra?");
            }
        
        }catch(IOException e){
            e.getMessage();
        } 
    }
        


    public int escolher() {
        int escolha = 100;
        try{
        Scanner escaneador = new Scanner(System.in);
        for (int i = 0; i < escolhas.size(); i++){
       
        System.out.println(this.escolhas.get(i).getTexto());
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
            
            
        } 
        
        return escolha;
        
      }
}

