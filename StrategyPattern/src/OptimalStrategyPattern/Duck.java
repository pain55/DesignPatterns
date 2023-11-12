package OptimalStrategyPattern;

public abstract class Duck {

    protected Quackable quackable;
    protected Flyable flyable;


    Duck() {
    }

    void performFly() {
        flyable.fly();
    }

    void performQuack() {
        quackable.quack();
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    abstract void display();

//  to set custom behaviour at runtime
    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
