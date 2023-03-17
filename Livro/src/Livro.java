import java.util.ArrayList;

public class Livro {
        public static void main(String[] args) throws Exception {
                Personagem MathYeus = new Personagem("Math Yeus", 5, 2);

                MathYeus.exibirStatus();
               
               

                String instrucao = "Esse é um livro que conta a historia de Math Yeus em sua provável desventura em um mundo um tanto quanto esquisito. Essa história interativa irá contar com o auxilio do usuário na tomada de decisões. Essas escolhas serão tomadas por meio de decisões binários, com o digito O ou o digito 1, indicados respectivamente. Math Yeus acorda em um simples local chamado Villace zamo, sem ter qualquer outra memoria do que fez de sua vida até então.Ao observar o local, encontra dois possiveis destinos para se situar sobre onde ele se encontra. A direita, tem-se um lugar semelhante a um enorme castelo, no qual a frente pasta uma vaca gigantesca A esquerda, vê que há algo semelhante a uma guilda, com alguns avisos na parede, mas voce não consegue ler. ";
                String texto1a = "Voce vai para o castelo e na frente voce observa novamente a vaca, com músculos inacreditavelmente grandes. Por fim, voce se pergunta como ela ficou desse jeito. A vaca come a grama com uma intensidade assustadora e voce, por alguma razão, cogita comer a grama também.";
                String texto2a = "Voce come a grama e nada acontece. Por acaso voce é idiota? A vaca aparentemente está irritada por voce ter comido a grama dela e parte pra cima de voce. Acertando-o no estômago com um impacto que você voa alguns bons metros.";
                String texto1b = "Voce entra na guilda e encontra um ambiente caótico, com diversos homens brigando e bebendo. Mas uma figura se destaca no ambiente, no balcão há uma mulher loira e com músculos aparentes, a qual parece impor respeito naquele local. Voce vai falar com ela e se apresenta. O nome dela é Karine, e ela explica que ela é líder da guilda. Karine fica curiosa com sua presença e te desafia você para uma luta.";
                String texto3a = "Voce ignora a enorme vaca e prossegue para o castelo. Chegando ao castelo voce encontra três homens grandes e com aparências imponentes. Ao iniciar uma conversa com eles, eles se apresentam como Joffrey, o mago do Reino, o Caulo Muzy, o bibliotecário e o próprio Rei, Cristan. Caulo muzy convida voce para visitar a biblioteca, porém Joffrey, com muita bondade, te chama para visitar sua sala mágica.O rei, no entando, parece pouco se importar com voce. Apenas dá as costas e vai embora para uma sala com um trono.";
                String texto3b = "Voces chegam em um lugar semelhante a um coliseu romano sem público, Karine diz para voce se preparar e ir para o lado oposto da arena. Ela possui uma espada enorme.  Voce não entende bem  o que aconteceu,  mas sua cabeça está separada do seu corpo.";
                String texto4a = "No caminho da biblioteca, vocês são teletransportados para uma floresta branca que voce nunca viu antes, e voces encaram uma figura semelhante a um Samurai dos tempos antigos do japão.";
                String texto4b = "Os outros homens ficam irritados por voce ter rejeitado o convite de Karine, voce é arremessado contra a parede e apaga.";
                String texto4ab = "Voce segue Joffrey até a sala dele, chegando lá, abre-se uma porta mágica no centro da sala e de lá sai um mago - que parece ser ainda mais implacável que o Joffrey.";
               
              
              
                Capitulo capitulo1a = new Capitulo("Capitulo 1", texto1a, MathYeus);
                Capitulo capitulo1b = new Capitulo("Capitulo 1", texto1b , MathYeus);
                Capitulo capitulo2a = new Capitulo("Capitulo 2", texto2a, MathYeus);
                Capitulo capitulo3a = new Capitulo("Capitulo 3", texto3a, MathYeus);
                Capitulo capitulo3b = new Capitulo("Capitulo 3", texto3b, MathYeus);
                Capitulo capitulo4a = new Capitulo("Capitulo 4", texto4a, MathYeus);
                Capitulo capitulo4ab = new Capitulo("Capitulo 4", texto4ab, MathYeus);
                Capitulo capitulo4b = new Capitulo("Capitulo 4", texto4b, MathYeus);
                
                Escolha temp1EscolhaCap0 = new Escolha();
                temp1EscolhaCap0.adicionar("0 para ir ao Castelo", capitulo1a);
                Escolha temp0EscolhaCap0 = new Escolha();
                temp0EscolhaCap0.adicionar("1 para ir a Guilda", capitulo1b);
                ArrayList<Escolha> escolhasCap0 = new ArrayList<Escolha>();
                escolhasCap0.add(temp1EscolhaCap0);
                escolhasCap0.add(temp0EscolhaCap0);
                Capitulo raiz = new Capitulo("Introdução", instrucao, MathYeus);
                raiz.escolhas = escolhasCap0;
                System.out.println(escolhasCap0);

                Escolha temp1EscolhaCap1 = new Escolha();
                temp1EscolhaCap1.adicionar("1 para comer a grama", capitulo2a);
                Escolha temp0EscolhaCap1 = new Escolha();
                temp0EscolhaCap1.adicionar("0 para não comer a grama", capitulo3a);
                ArrayList<Escolha> escolhasCap1a = new ArrayList<Escolha>();
                
                escolhasCap1a.add(temp0EscolhaCap1);
                escolhasCap1a.add(temp1EscolhaCap1);
                capitulo1a.escolhas = escolhasCap1a;

                
                Escolha temp1EscolhaCap3a = new Escolha();
                temp1EscolhaCap3a.adicionar("1 para acompanhar Caulo ", capitulo4a);
                Escolha temp0EscolhaCap3a = new Escolha();
                temp0EscolhaCap3a.adicionar("0 para seguir Joffrey", capitulo4ab);
                ArrayList<Escolha> escolhasCap3a = new ArrayList<Escolha>();
                capitulo3a.escolhas = escolhasCap3a;

                Escolha temp1EscolhaCap1b = new Escolha();
                temp1EscolhaCap1b.adicionar("1 para lutar", capitulo3b);
                Escolha temp0EscolhaCap1b = new Escolha();
                temp0EscolhaCap1b.adicionar("0 para não lutar", capitulo4b);
                ArrayList<Escolha> escolhasCap1b = new ArrayList<Escolha>();
                escolhasCap1b.add(temp0EscolhaCap1b);
                escolhasCap1b.add(temp1EscolhaCap1b);

                capitulo1b.escolhas = escolhasCap1b;

                
                raiz.executar();
                

        }
}
