package OptimalStrategyPattern;

public abstract class Duck {


//  Here we are establishing HAS-A(Composition) Relationship
//  HAS-A Relationship is better than IS-A(Inheritance)
//  Making these variables visible for all classes which extends Duck and can use its methods.
    protected Quackable quackable;
    protected Flyable flyable;


    Duck() {
    }

//  dynamically calling functions at runtime when we assign them in runtime
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

//    to set custom quack behavior at runtime
    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }
}
