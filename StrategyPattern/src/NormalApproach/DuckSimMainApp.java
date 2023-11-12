package NormalApproach;

public class DuckSimMainApp {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();

        rubberDuck.quack();


//        This is where the above approach goes wrong.. if you ask Why?
//        because do you think rubber duck will fly?
//        In effort to make code reuse, it made a major flaw in functionality.
//        The main problem with inheritance when a child class inherits the parent class it inherits the all methods
//        in some cases we don't want the child class to inherit certain methods because it makes no sense for them.
        rubberDuck.fly();
    }
}
