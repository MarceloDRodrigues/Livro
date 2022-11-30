import java.util.Scanner;

public class Livro {
    public static void main(String[] args) throws Exception {
        Scanner escaneador = new Scanner(System.in);
        System.out.println("Hello, World!");
        System.out.println("Eita kisso");
        System.out.println("Esse é um jogo que conta a historia de Math Yeus em sua provavel desventura em um mundo um tanto quanto esquisito.");
        System.out.println("Essa história interativa irá contar com o auxilio do jogador na tomada de decisões.");
        System.out.println("Essas escolhas serão tomadas por meio de decisões binários, com o digito O ou o digito 1, indicado como se segue cada um respectivamente");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Math Yeus acorda em um simples local chamado Vila Cesamo, sem ter qualquer outra memoria do que fez de sua vida até então.");
        System.out.println("Ao observar o local, encontra dois possiveis destinos para se situar sobre onde ele se encontra. A direita, tem-se um lugar semelhante a um enorme castelo, no qual a frente pasta uma vaca de tamanho gigantesco");
        System.out.println("A esquerda, vê que há algo semelhante a uma guilda, o qual estranhamente ele sabe da existência.");
        System.out.println("Digite 1 para ir ao Castelo e 0 para ir a Guilda!!!!");
        int escolha1 = escaneador.nextInt(); 
        if (escolha1 == 1){
            boolean castelo = true;
        } else {
            boolean guilda = true;
        }
        
        escaneador.close(); 
    }
}
