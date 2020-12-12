package learn.patterns.decorator;

import learn.patterns.decorator.base.Beverage;
import learn.patterns.decorator.baseextended.Caffeine;
import learn.patterns.decorator.baseextended.DarkRoast;
import learn.patterns.decorator.baseextended.Espresso;
import learn.patterns.decorator.decoratorextended.Cream;
import learn.patterns.decorator.decoratorextended.Mocha;
import learn.patterns.decorator.decoratorextended.Roasted;

public class DecoratorApplication {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Cream(beverage);//10+5+2

        System.out.println(beverage.getDescription() + " costs " + beverage.cost());

        Beverage beverage1 = new Caffeine();
        beverage1 = new Roasted(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);//11+10+5+5

        System.out.println(beverage1.getDescription() + " costs " + beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Cream(beverage2);//15+2

        System.out.println(beverage2.getDescription() + " costs " + beverage2.cost());

    }
}
