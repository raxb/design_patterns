package learn.patterns.singleton;

public class SingletonValidator {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println("Object 1 is  " + obj1.toString());

        Singleton obj2 = Singleton.getInstance();
        System.out.println("Object 2 is  " + obj2.toString());

        if (obj1 == obj2) {
            System.out.println("Object Instances are equal");
        }
    }
}
