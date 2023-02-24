import java.util.Scanner;
import java.util.Random;

public class Livro {
        public static void main(String[] args) throws Exception {
                Personagem MathYeus = new Personagem("Math Yeus", 5, 2);
                String texto1 = "Math Yeus acorda em um simples local chamado Villace zamo, sem ter qualquer outra memoria do que fez de sua vida até então.Ao observar o local, encontra dois possiveis destinos para se situar sobre onde ele se encontra. A direita, tem-se um lugar semelhante a um enorme castelo, no qual a frente pasta uma vaca gigantesca A esquerda, vê que há algo semelhante a uma guilda, com alguns avisos na parede, mas voce não consegue ler.";

                MathYeus.exibirStatus();
                Scanner escaneador = new Scanner(System.in);
                Random dado = new Random();

                System.out.println(
                                "Esse é um livro que conta a historia de Math Yeus em sua provável desventura em um mundo um tanto quanto esquisito.");
                System.out.println(
                                "Essa história interativa irá contar com o auxilio do usuário na tomada de decisões.");
                System.out.println(
                                "Essas escolhas serão tomadas por meio de decisões binários, com o digito O ou o digito 1, indicados respectivamente");
                System.out.println("----------------------------------------------------------------------");

                System.out.println("Digite 1 para ir ao Castelo e 0 para ir a Guilda!!!!");
                int escolha = escaneador.nextInt();

                if (escolha == 1) {
                        Personagem vaca = new Personagem("Vaca", 9999, 9999);
                        System.out.println(
                                        "Voce vai para o castelo e na frente voce observa novamente a vaca, com músculos inacreditavelmente grandes. Por fim, voce se pergunta como ela ficou desse jeito.");
                        System.out.println(
                                        "A vaca come a grama com uma intensidade assustadora e voce, por alguma razão, cogita comer a grama também. Voce irá comer a grama? 1 para sim e 0 para não.");
                        int escolha_a1 = escaneador.nextInt();
                        if (escolha_a1 == 1) {
                                System.out.println("Voce come a grama e nada acontece. Por acaso voce é idiota?");

                                System.out.println(
                                                "A vaca aparentemente está irritada por voce ter comido a grama dela e parte pra cima de voce. Acertando-o no estômago com um impacto que você voa alguns bons metros.");
                        } else {
                                Personagem Joffrey = new Personagem("Joffrey", 100, 50);
                                Personagem Rei = new Personagem("Rei", 150, 150);
                                Personagem Caulo = new Personagem("Caulo", 50, 15);
                                System.out.println("Voce ignora a enorme vaca e prossegue para o castelo.");
                                System.out.println(
                                                "Chegando ao castelo voce encontra três homens grandes e com aparências imponentes. Ao iniciar uma conversa com eles, eles se apreseentam como Joffrey, o mago do Reino, o Caulo Muzy, o bibliotecário e o próprio Rei, Cristan.");
                                System.out.println(
                                                "Caulo muzy convida voce para visitar a biblioteca, porém Joffrey, com muita bondade, te chama para visitar sua sala mágica.");
                                System.out.println(
                                                "O rei, no entando, parece pouco se importar com voce. Apenas dá as costas e vai embora para uma sala com um trono.");
                                System.out.println("Digite 1 para acompanhar Caulo e 0 para seguir Joffrey!!!!");
                                int escolha_a2 = escaneador.nextInt();
                                if (escolha_a2 == 1) {
                                        System.out.println(
                                                        "No caminho da biblioteca, vocês são teletransportados para uma floresta branca que voce nunca viu antes, e voces encaram uma figura semelhante a um Samurai dos tempos antigos do japão.");
                                } else {
                                        System.out.println(
                                                        "Voce segue Joffrey até a sala dele, chegando lá, abre-se uma porta mágica no centro da sala e de lá sai um mago - que parece ser ainda mais implacável que o Joffrey.");

                                }
                        }
                } else {

                        System.out.println(
                                        "Voce vai para a guilda e encontra um aviso rasgado sobre tomar cuidado com alguma coisa que voce só consegue identificar que haviam 5 letras ali.");
                        int d20 = dado.nextInt(19) + 1;
                        if (d20 >= 10) {
                                Armas espadaKarine = new Armas("Fiodor", 120, 5);
                                Personagem Karine = new Personagem("Karine", 100, 50);
                                Karine.setObjetoDeDefesa(espadaKarine);

                                System.out.println(
                                                "Voce entra na guilda e encontra um ambiente caótico, com diversos homens brigando e bebendo. Mas uma figura se destaca no ambiente, no balcão há uma mulher loira e com músculos aparentes, a qual parece impor respeito naquele local. Voce vai falar com ela e se apresenta. O nome dela é Karine, e ela explica que ela é líder da guilda");
                                System.out.println(
                                                "Karine fica curiosa com sua presença e te oferece uma bebida. Voce aceita? 1 para sim e 0 para não");
                                Bebidas coquinha = new Bebidas("Coquinha", d20, false);
                                System.out.println(
                                                "Em sequência, desafia você para uma luta. Voce aceita? 0 para sim e 1 para não.");

                                int escolha_b1 = escaneador.nextInt();
                                if (escolha_b1 == 1) {
                                        System.out.println(
                                                        "Voces chegam em um lugar semelhante a um coliseu romano sem público, Karine diz para voce se preparar e ir para o lado oposto da arena.");
                                        System.out.println("Ela possui uma espada enorme com " + espadaKarine.getDano()
                                                        + " de dano");
                                        System.out.println(
                                                        "Voce não entende bem o que aconteceu, mas sua cabeça está separada do seu corpo.");
                                        espadaKarine.atacar(MathYeus);
                                } else {
                                        System.out.println(
                                                        "Os outros homens ficam irritados por voce ter rejeitado o convite de Karine, voce é arremessado contra a parede e apaga.");
                                }
                        } else {
                                System.out.println(
                                                "Voce toma uma bicuda de algum bêbado através da porta e começa a voar indefinidamente.");
                        }
                }

                escaneador.close();
        }
}
