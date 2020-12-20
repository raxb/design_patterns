package learn.patterns.templatemethod;

public class TemplateApplication {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("Making Coffee -----");
        coffee.prepareBeverage();
        System.out.println("Making Tea -----");
        tea.prepareBeverage();
    }
}
