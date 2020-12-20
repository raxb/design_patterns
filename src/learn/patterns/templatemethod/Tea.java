package learn.patterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon and sugar");
    }

    @Override
    public boolean condimentRequired() {
        System.out.println("Does the customer require condiments to be added y/n");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = userInput.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input != null && !input.equalsIgnoreCase("n");
    }
}
