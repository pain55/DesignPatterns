package OptimalStrategyPattern;

public class MallardDuck extends Duck{

    MallardDuck() {
        quackable = new Quack();
        flyable = new FlyWithWings();
    }




    @Override
    void display() {
        System.out.println("I'm mallard Duck!!");
    }
}
