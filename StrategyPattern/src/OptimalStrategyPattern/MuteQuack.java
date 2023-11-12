package OptimalStrategyPattern;

public class MuteQuack implements Quackable{

    @Override
    public void quack() {
        System.out.println("I'm silent!!");
    }
}
