package NormalApproach;

public class RubberDuck extends Duck{

    @Override
    void quack() {
        System.out.println("Squeak!!!");
    }

    @Override
    void display() {
        System.out.println("I'm rubber Duck");
    }
}
