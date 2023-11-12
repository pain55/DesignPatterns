package OptimalStrategyPattern;

public class DuckSimMainApp {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setQuackable(new Squeak());
        mallardDuck.performQuack();

    }
}
