package learn.patterns.facade;

public class HomeTheaterFacade {
    Amplifier amp;
    Player player;
    Projector projector;

    public HomeTheaterFacade(Amplifier amp, Player player, Projector projector) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
    }

    public void watchMovie() {
        amp.volumeUp();
        player.loadMovie();
        projector.on();
        projector.wideScreenMode();
    }

    public void endMovie() {
        projector.off();
        player.ejectDisc();
        amp.off();
    }
}
