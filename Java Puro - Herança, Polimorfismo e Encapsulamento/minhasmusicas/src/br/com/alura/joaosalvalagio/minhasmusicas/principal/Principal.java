package br.com.alura.joaosalvalagio.minhasmusicas.principal;

import br.com.alura.joaosalvalagio.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.joaosalvalagio.minhasmusicas.modelos.Musica;
import br.com.alura.joaosalvalagio.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Minha Musica");
        minhaMusica.setCantor("Meu cantor");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Meu Podcast");
        meuPodcast.setApresentador("Meu apresentador");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast);
        preferidas.incluir(minhaMusica);

    }
}
