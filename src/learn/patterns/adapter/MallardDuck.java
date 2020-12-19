package learn.patterns.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
