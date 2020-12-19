package learn.patterns.command;

public class Light {
    public static String location;

    public Light(String lightingLocation) {
        location = lightingLocation;
    }

    public void on() {
        System.out.println("Lights ON");
    }

    public void off() {
        System.out.println("Lights OFF");
    }
}
