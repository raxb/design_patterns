package learn.patterns.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("GOBBLE");
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            System.out.println("I fly short distance");
        }
    }
}
