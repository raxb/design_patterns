package learn.patterns.facade;

public class Player {
    public void loadMovie() {
        System.out.println("Loading Movie in the player");
    }

    public void ejectDisc() {
        System.out.println("Movie done playing");
    }
}
