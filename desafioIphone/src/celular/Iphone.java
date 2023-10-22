package celular;

import funcionalidades.Chamada;
import funcionalidades.Navegador;
import funcionalidades.ReprodutorMusical;

public class Iphone implements Chamada, Navegador, ReprodutorMusical {

    @Override
    public void ligar(String contato) {
        System.out.println("Chamando o contato '"+contato+"'...");
    }


    @Override
    public void atender() {
        System.out.println("Seu IPhone está tocando!!!");
    }

    @Override
    public void correioVoz() {
        System.out.println("Chamando correio de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Você abriu uma nova aba no navegador web.");
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Reproduzindo a música '"+ musica +"' agora.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Reprodutor musical pausado.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Você selecionou a música '"+ musica +"' para reprodução.");
    }


   
    }

