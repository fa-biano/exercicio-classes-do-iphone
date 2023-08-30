package iphone_apps;

import interfaces.GenericFeatures;
import interfaces.MusicPlayerInterface;

public class MusicPlayer extends GenericFeatures implements MusicPlayerInterface {

    @Override
    public void play() {
        System.out.println("Tocando musica selecionada...");
    }

    @Override
    public void pause() {
        System.out.println("Musica pausada...");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando musica...");
    }
}
