package OptimalStrategyPattern;

public class WoodenDuck extends Duck{

    WoodenDuck() {
        quackable = new MuteQuack();
        flyable = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("I'm wooden duck");
    }
}
