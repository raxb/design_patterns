package learn.patterns.facade;

public class FacadeApplication {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Player player = new Player();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifier, player, projector);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
