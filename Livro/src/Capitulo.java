public class Capitulo {
    String nome;
    String texto;
    int escolha;
    Personagem personagem;
    int alteracaoEnergia;

    public Capitulo(String nome, String texto,
            int alteracaoEnergia) {
        this.nome = nome;
        this.texto = texto;
        this.escolha = escolha;
        this.alteracaoEnergia = alteracaoEnergia;
    }

    public void mostrar() {
        System.out.println(texto);

    }

    String textoIntroducao = "Math Yeus acorda em um simples local chamado Villace zamo, sem ter qualquer outra memoria do que fez de sua vida até então.Ao observar o local, encontra dois possiveis destinos para se situar sobre onde ele se encontra. A direita, tem-se um lugar semelhante a um enorme castelo, no qual a frente pasta uma vaca gigantesca A esquerda, vê que há algo semelhante a uma guilda, com alguns avisos na parede, mas voce não consegue ler.";
    String instrucao = "Esse é um livro que conta a historia de Math Yeus em sua provável desventura em um mundo um tanto quanto esquisito. Essa história interativa irá contar com o auxilio do usuário na tomada de decisões. Essas escolhas serão tomadas por meio de decisões binários, com o digito O ou o digito 1, indicados respectivamente.";
    String texto1a = "Voce vai para o castelo e na frente voce observa novamente a vaca, com músculos inacreditavelmente grandes. Por fim, voce se pergunta como ela ficou desse jeito. A vaca come a grama com uma intensidade assustadora e voce, por alguma razão, cogita comer a grama também. Voce irá comer a grama? 1 para sim e 0 para não";
    String texto1bb = "Voce vai para a guilda e encontra um aviso rasgado sobre tomar cuidado com alguma coisa que voce só consegue identificar que haviam 5 letras ali.";
    String texto2a = "Voce come a grama e nada acontece. Por acaso voce é idiota? A vaca aparentemente está irritada por voce ter comido a grama dela e parte pra cima de voce. Acertando-o no estômago com um impacto que você voa alguns bons metros.";
    String texto2b = "Voce entra na guilda e encontra um ambiente caótico, com diversos homens brigando e bebendo. Mas uma figura se destaca no ambiente, no balcão há uma mulher loira e com músculos aparentes, a qual parece impor respeito naquele local. Voce vai falar com ela e se apresenta. O nome dela é Karine, e ela explica que ela é líder da guilda. Karine fica curiosa com sua presença e te oferece uma bebida. Voce aceita? 1 para sim e 0 para não. Em sequência, desafia você para uma luta. Voce aceita? 0 para sim e 1 para não.";
    String texto3a = "Voce ignora a enorme vaca e prossegue para o castelo. Chegando ao castelo voce encontra três homens grandes e com aparências imponentes. Ao iniciar uma conversa com eles, eles se apreseentam como Joffrey, o mago do Reino, o Caulo Muzy, o bibliotecário e o próprio Rei, Cristan.Caulo muzy convida voce para visitar a biblioteca, porém Joffrey, com muita bondade, te chama para visitar sua sala mágica.O rei, no entando, parece pouco se importar com voce. Apenas dá as costas e vai embora para uma sala com um trono.Digite 1 para acompanhar Caulo e 0 para seguir Joffrey!!!!";
    String texto3b = "Voces chegam em um lugar semelhante a um coliseu romano sem público, Karine diz para voce se preparar e ir para o lado oposto da arena. Ela possui uma espada enorme.  Voce não entende bem  o que aconteceu,  mas sua cabeça está separada do seu corpo.";
    String texto3aa = "No caminho da biblioteca, vocês são teletransportados para uma floresta branca que voce nunca viu antes, e voces encaram uma figura semelhante a um Samurai dos tempos antigos do japão.";
    String texto3bb = "Os outros homens ficam irritados por voce ter rejeitado o convite de Karine, voce é arremessado contra a parede e apaga.";
    String texto3ab = "No caminho da biblioteca, vocês são teletransportados para uma floresta branca que voce nunca viu antes, e voces encaram uma figura semelhante a um Samurai dos tempos antigos do japão.";
    String texto1 = "Voce toma uma bicuda de algum bêbado através da porta e começa a voar indefinidamente.";

    Capitulo introducao = new Capitulo("Introdução", instrucao, 0);
    Capitulo capitulo1a = new Capitulo("Capitulo 1", texto1a, -1);
    Capitulo capitulo1b = new Capitulo("Capitulo 1", texto1bb, -1);
    Capitulo capitulo2a = new Capitulo("Capitulo 2", texto2a, -1);
    Capitulo capitulo2b = new Capitulo("Capitulo 3", texto2b, -1);
    Capitulo capitulo3a = new Capitulo("Capitulo 3", texto3a, -1);
    Capitulo capitulo3b = new Capitulo("Capitulo 3", texto3b, -1);

}
